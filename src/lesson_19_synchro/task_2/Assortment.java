package lesson_19_synchro.task_2;
import java.util.*;

public class Assortment {
    private List<Good> goods;

    Assortment() {
        goods = new ArrayList<>();
        goods.add(new Good(1, "Пиво", 2.1, 0));
        goods.add(new Good(2, "Водка", 1.8, 0));
        goods.add(new Good(3, "Чипсы", 2.1, 10));
        goods.add(new Good(4, "Хлеб", 1.5, 0));
        goods.add(new Good(5, "Молоко", 1.7, 10));
        goods.add(new Good(6, "Селедка", 3.2, 0));
        goods.add(new Good(7, "Кефир", 1.6, 0));
        goods.add(new Good(8, "Батон", 1.7, 10));
        goods.add(new Good(9, "Гречка", 1.4, 0));
        goods.add(new Good(10, "Колбаски", 5.5, 25));
        goods.add(new Good(11, "Йогурт", 0.9, 0));
        goods.add(new Good(12, "Булочка", 0.8, 20));
    }

    public void add(Good good) {
        for (Good g : goods){
            if (good.getId() == g.getId()){
                System.out.println("Такой товар уже существует");
                break;
            } else {
                goods.add(good);
            }
        }
    }

    public List<Good> getGoods() {
        return goods;
    }

    public int getSize(){
        return goods.size();
    }
}