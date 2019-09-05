package lesson_4.task_2;

/**
 * @author Daniil Kim
 * 2. Создать класс, описывающий банкомат. 
 * Набор купюр, находящихся в банкомате должен задаваться тремя свойствами: 
 * количеством купюр номиналом 20, 50 и 100. Сделать методы для добавления денег в банкомат. 
 * Сделать функцию, снимающую деньги, которая принимает сумму денег, а возвращает булевое значение -
 * успешность выполнения операции.
 * При снятии денег функция должна распечатывать каким количеством купюр какого номинала выдаётся сумма. 
 * Создать конструктор с тремя параметрами - количеством купюр каждого номинала.
 */

public class CashMachine {

    private int numOfBanknote_20;
    private int numOfBanknote_50;
    private int numOfBanknote_100;

    private final int banknote_20 = 20;
    private final int banknote_50 = 50;
    private final int banknote_100 = 100;


    public CashMachine(int numOfBanknote_20, int numOfBanknote_50, int numOfBanknote_100) {
        this.numOfBanknote_20 = numOfBanknote_20;
        this.numOfBanknote_50 = numOfBanknote_50;
        this.numOfBanknote_100 = numOfBanknote_100;
    }

    public void setBanknote20(int banknote20) {
        this.numOfBanknote_20 += banknote20;
    }

    public void setBanknote50(int banknote50) {
        this.numOfBanknote_50 += banknote50;
    }

    public void setBanknote100(int banknote100) {
        this.numOfBanknote_100 += banknote100;
    }


    public boolean withdrawMoney(int amount) {

        int maxAmount = numOfBanknote_20*banknote_20 + numOfBanknote_50*banknote_50 + numOfBanknote_100*banknote_100;
        System.out.println("Запрашиваемая сумма денег: " + amount);

        if (amount<20 || amount>maxAmount) {
            if (amount < 20) {
                System.out.println("Минимальная сумма вывода 20 р");
            }
            if (amount>maxAmount) {
                System.out.println("Недостаточно денег");
            }
            return false;
        }

        for (int i = 0; i<=banknote_20; i++){
            for (int x = 0; x<=banknote_50; x++){
                for (int y = 0; y<=banknote_100; y++){
                    if (isAcceptable(i, x, y, amount)) {
                        return cashOut(i, x, y);
                    }
                }
            }
        }
        System.out.println("В банкомате нет подходящих купюр.");
        return false;
    }

    private boolean cashOut(int i, int j, int x) {
        this.numOfBanknote_20 = this.numOfBanknote_20 - i;
        this.numOfBanknote_50 = this.numOfBanknote_50 - j;
        this.numOfBanknote_100 = this.numOfBanknote_100 - x;
        System.out.print("Выведено: " + (x * banknote_100 + j * banknote_50 + i * banknote_20) + "\n" +
                x + " номиналом 100р \n" +
                j + " номиналом 50 рублей \n" +
                i + " номиналом 20 рублей. \n");

        return true;
    }

    private boolean isAcceptable(int numOfBanknote_20, int numOfBanknote_50, int numOfBanknote_100, int amount) {
        int checkedAmount = numOfBanknote_20 * banknote_20 + numOfBanknote_50 * banknote_50 + numOfBanknote_100 * banknote_100;
        return checkedAmount == amount;
    }
}