package lesson_19_synchro.task_2;

import java.util.*;

public class Customer extends Thread{

    private boolean isChosen;
    private Shop shop;
    private ShoppingBasket myBasket;
    private Line line;
    private int id;
    private double money;

    Customer(Shop shop, Line line) {
        this.shop = shop;
        this.line = line;
        start();
    }

    // положить в корзину продукты(от 0 до 4 продуктов в количестве до 3 штук каждого из продуктов)
    public Map<Good, Integer> takeProducts(){
        Map<Good, Integer> chosen = new HashMap<>();
        Random random = new Random();
        int numOfProducts = random.nextInt(8);
        if (numOfProducts != 0){
            isChosen = true;
            for (int i = 0; i<numOfProducts; i++){
                int index = random.nextInt(shop.getProduction().size());
                Good g = shop.getProduction().get(index);
                int amount = random.nextInt(6) + 1;
                chosen.put(g,amount);
            }
        }else {
            isChosen = false;
        }
        return chosen;
    }

    public Shop getShop() {
        return shop;
    }

    public void takeID(int id){
        this.id = id;
    }

    public int getID(){
        return id;
    }

    // получить корзину для продуктов
    public void takeBasket(){
        myBasket = shop.giveBasket();
    }

    public ShoppingBasket getMyBasket(){
        return myBasket;
    }
    // время выбора продуктов одинаковое для всех покупателей
    public void think() {
        try {
            sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // выдать сумму такую же или больше
    public double giveMoney(double sum){
        Random random = new Random();
        money = random.nextDouble()+sum;
        return money;
    }

    @Override
    public void run() {
        shop.enter(this);
        takeBasket();
        think();
        myBasket.put(takeProducts());
        if (isChosen){
            System.out.println("Customer " + id + " chose " + myBasket.getBasket());
            line.put(this);
            System.err.println("Customer " + id + " stood in the line ");
        } else {
            System.out.println("Customer " + id + " chose nothing");
            shop.left(this);
        }
    }

    @Override
    public String toString() {
        return "Customer " + id + " " + myBasket.getBasket() + "\n";
    }
}
