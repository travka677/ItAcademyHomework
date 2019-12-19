package lesson_19_synchro.task_2;
import java.util.*;

public class Shop {

    private List<Good> production;
    private Assortment assortment;
    private int counter = 0;

    Shop(Assortment assortment, Line line){
        production = new ArrayList<>();
        this.assortment = assortment;
        production.addAll(assortment.getGoods());
    }

    public synchronized void enter(Customer customer){
        customer.takeID(++counter);
        System.out.println("Customer " + customer.getID() + " arrived to the shop");
    }

    public void left(Customer customer){
        System.err.println("Customer " + customer.getID() + " left the shop");
    }


    public ShoppingBasket giveBasket(){
        return new ShoppingBasket();
    }

    public List<Good> getProduction(){  // По условию ассортимент магазина бесконечный
        return production;
    }

}
