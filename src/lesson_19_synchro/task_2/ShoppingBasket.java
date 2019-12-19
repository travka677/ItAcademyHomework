package lesson_19_synchro.task_2;

import java.util.*;

public class ShoppingBasket {

    private Map<Good, Integer> basket;

    ShoppingBasket(){
        basket = new HashMap<>();
    }

    public void put(Map<Good, Integer> map){ // корзина не имеет размера по условию
        basket.putAll(map);
    }

    public Map<Good, Integer> getBasket(){
        return basket;
    }

}
