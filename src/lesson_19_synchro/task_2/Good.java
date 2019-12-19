package lesson_19_synchro.task_2;

public class Good {

    private int id;
    private String name;
    private double price;
    // в процентах
    private int discount;

    Good(int id, String name, double price, int discount){
        this.id = id;
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    public double getPrice() {
        return price;
    }

    public double priceAfterDiscount(){
        return price - price*discount/100;
    }

    @Override
    public String toString() {
        return name + "{" + "id = " + id + " | price = " + price + " | discount = " + discount + "}";
    }
}
