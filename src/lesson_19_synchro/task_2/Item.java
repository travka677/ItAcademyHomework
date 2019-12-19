package lesson_19_synchro.task_2;

public class Item {

    private int position;
    private Good good;
    private int quantity;
    // итоговая стоимость товара с учетом количества
    private double cost;
    private double discount;

    public Item(int position, Good good, int quantity, double cost, double discount) {
        this.position = position;
        this.good = good;
        this.quantity = quantity;
        this.cost = cost;
        this.discount = discount;
    }

    @Override
    public String toString() {
        String s;
        if (discount > 0){
            s = String.format("%d.%-14s%8.2f\n%6.2fx%-12d-%-4.2f", position, good.getName(), cost,
                    good.getPrice(), quantity, discount);
            return s;
        }else {
            s = String.format("%d.%-14s%8.2f\n%6.2fx%d", position, good.getName(), cost,
                    good.getPrice(), quantity);
            return s;
        }
    }
}
