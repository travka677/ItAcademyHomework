package lesson_19_synchro.task_2;

import java.util.*;
import java.util.concurrent.TimeoutException;

public class CashBox extends Thread {

    private int serviceTime = 0;
    private int ID;
    private Line line;
    private Customer customer;
    private static final int WAIT_TIME = 1000;
    private int count = 0;

    CashBox(Line line, int ID) {
        this.line = line;
        this.ID = ID;
        start();
    }

    // расчитать время обслуживания
    public void calculateTime() {
        Map<Good, Integer> map = customer.getMyBasket().getBasket();
        Collection<Integer> collection = map.values();
        for (Integer i : collection) {
            serviceTime += i;
        }
    }

    // время обслуживания
    public void serve() {
        try {
            sleep(serviceTime * 100);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    // Касса логирует все действия с товарами покупателя и формирует сумму покупки(с учетом скидок).
    public double calculateSum(){
        double sum = 0;
        Map<Good, Integer> map = customer.getMyBasket().getBasket();
        for (Map.Entry<Good, Integer> m : map.entrySet()){
            Good good = m.getKey();
            int quantity = m.getValue();
            System.out.println(good.getName() + " (" + quantity + ")");
            if (good.getDiscount() > 0){
                sum += good.priceAfterDiscount() * quantity;
            } else {
                sum += good.getPrice() * quantity;
            }
        }
        return sum;
    }

    // расчитать сдачу
    public double calculateChange(double customerMoney, double totalSum) {
        if (customerMoney > totalSum){
            return customerMoney - totalSum;
        } else {
            return 0;
        }
    }

    // идентифицированные товары в чеке
    public List<Item> identifiedGoods(){
        List<Item> list = new ArrayList<>();
        Map<Good, Integer> map = customer.getMyBasket().getBasket();
        int n = 0;
        for (Map.Entry<Good, Integer> m : map.entrySet()){
            ++n;
            Good good = m.getKey();
            int quantity = m.getValue();
            double cost = good.getPrice() * quantity;
            double discount = 0;
            if (good.getDiscount() > 0){
                discount = quantity * (good.getPrice() - good.priceAfterDiscount());
            }
            list.add(new Item(n, good, quantity, cost, discount));
        }
        return list;
    }

    // расчитать итоговую сумму скидок
    public double calculateTotalDiscount(){
        Map<Good, Integer> map = customer.getMyBasket().getBasket();
        double totalDiscount = 0;
        for (Map.Entry<Good, Integer> m : map.entrySet()){
            Good good = m.getKey();
            int quantity = m.getValue();
            if (good.getDiscount() > 0){
                totalDiscount += quantity * (good.getPrice() - good.priceAfterDiscount());
            }
        }
        return totalDiscount;
    }


    @Override
    public void run() {
        while (true) {
            try {
                customer = line.get(WAIT_TIME);
            } catch (TimeoutException e) {
                break;
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            if (customer == null) {  // разобраться почему NullPointerException
                break;
            }
            ++count;
            calculateTime();
            System.out.println("\nCustomer " + customer.getID() + " is served by cash box number " + ID);
            serve();
            double totalSum = calculateSum();
            System.out.printf("You must pay %.2f",totalSum);
            double customerMoney = customer.giveMoney(totalSum);
            System.out.printf("\nCustomer gave %.2f", customerMoney);
            double change = calculateChange(customerMoney, totalSum);
            if (change > 0){
                System.out.printf("\nTake the change %.2f", change);
            }
            System.out.println("\nTake the receipt");
            new Receipt(count, ID, totalSum, change, identifiedGoods(), calculateTotalDiscount(), customerMoney).print();
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            customer.getShop().left(customer);
        }
    }
}
