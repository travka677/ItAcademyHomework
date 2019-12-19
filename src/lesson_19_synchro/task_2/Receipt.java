package lesson_19_synchro.task_2;

import java.util.*;

public class Receipt {
    // порядковый номер покупателя(счетчик кассы)
    private int id;
    private Date date;
    private int cashBoxNo;
    private List<Item> list;
    private double totalSum;
    private double change;
    private double totalDiscount;
    private double customerMoney;

    Receipt(int id, int cashBoxNo, double totalSum, double change, List<Item> list, double totalDiscount, double customerMoney){
        this.id = id;
        this.cashBoxNo = cashBoxNo;
        this.totalSum = totalSum;
        this.change = change;
        date = new Date();
        this.list = list;
        this.totalDiscount = totalDiscount;
        this.customerMoney = customerMoney;
    }

    public void print(){
        System.out.println("\n\t\t  EVROOPT");
        System.out.println("Cash box № " + cashBoxNo);
        System.out.println("=============================");
        for (Item i : list){
            System.out.println(i);
        }
        System.out.println("=============================");
        System.out.printf("%-15s%9.2f\n", "Total discount", totalDiscount);
        System.out.printf("%-15s%9.2f\n", "To pay", totalSum);
        System.out.printf("%-15s%9.2f\n", "Paid", customerMoney);
        System.out.printf("%-15s%9.2f\n", "Change", change);
        System.out.println(date);
        System.out.println("Receipt № " + id);
        System.out.println("-----------------------------");
    }
}
