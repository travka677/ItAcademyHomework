package lesson_19_synchro.task_2;

public class Simulator implements Runnable{

    private int numOfCustomers;
    private int numOfCashBox;

    Simulator (int numOfCustomers, int numOfCashBox){
        this.numOfCustomers = numOfCustomers;
        this.numOfCashBox = numOfCashBox;
    }

    @Override
    public void run() {
        Assortment assortment = new Assortment();
        Line line = new Line();
        Shop shop = new Shop(assortment, line);
        for (int i = 0; i<numOfCustomers; i++) {
            new Customer(shop, line);
        }
        for (int i = 1; i<=numOfCashBox; i++){
            new CashBox(line, i);
        }

    }
}
