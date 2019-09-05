package lesson_4.task_2;

public class CashMachine_test {
    public static void main(String[] args) {

        CashMachine cashMachine = new CashMachine(10,10,10);

//        cashMachine.setBanknote20(1);
//        cashMachine.setBanknote50(2);
//        cashMachine.setBanknote100(3);

        cashMachine.withdrawMoney(19);

    }
}