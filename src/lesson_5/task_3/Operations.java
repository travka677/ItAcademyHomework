package lesson_5.task_3;

import java.math.BigDecimal;

/**
 * @author Daniil Kim
 * 3. Определить класс, который при инициализации принимает на вход 2 аргумента целого или вещественного типа.
 * Задать перегруженные методы возвращающие результат арифметических операций над заданными полями
 * и полями типа BigDecimal.
 * */

public class  Operations{

    private Integer integerArgument1;
    private Integer integerArgument2;
    private Double doubleArgument1;
    private Double doubleArgument2;

    private BigDecimal bigDecimalOne = new BigDecimal("15445.234646743");
    private BigDecimal bigDecimalTwo = new BigDecimal("1434234.4535423");


    public Operations(int integerArgument1, int integerArgument2){
        this.integerArgument1 = integerArgument1;
        this.integerArgument2 = integerArgument2;
    }
    public Operations(double doubleArgument1, double doubleArgument2){
        this.doubleArgument1 = doubleArgument1;
        this.doubleArgument2 = doubleArgument2;
    }
    public Operations(int integerArgument1, double doubleArgument1){
        this.integerArgument1 = integerArgument1;
        this.doubleArgument1 = doubleArgument1;
    }
    public Operations(double doubleArgument1, int integerArgument1){
        this.doubleArgument1 = doubleArgument1;
        this.integerArgument1 = integerArgument1;
    }



    // операции с аргументами:

    public double sum(){
        if (integerArgument1 != null && integerArgument2 != null){
            return integerArgument1 + integerArgument2;
        }
        if (doubleArgument1 != null && doubleArgument2 != null){
            return doubleArgument1 + doubleArgument2;
        }
        if (integerArgument1 != null && doubleArgument1 != null){
            return integerArgument1 + doubleArgument1;
        }
        System.out.println("Какая-то ошибка");
        return -1;
    }

    public double subtract(){
        if (integerArgument1 != null && integerArgument2 != null){
            return integerArgument1 - integerArgument2;
        }
        if (doubleArgument1 != null && doubleArgument2 != null){
            return doubleArgument1 - doubleArgument2;
        }
        if (integerArgument1 != null && doubleArgument1 != null){
            return integerArgument1 - doubleArgument1;
        }
        System.out.println("Какая-то ошибка");
        return -1;
    }

    public double multiply(){
        if (integerArgument1 != null && integerArgument2 != null){
            return integerArgument1 * integerArgument2;
        }
        if (doubleArgument1 != null && doubleArgument2 != null){
            return doubleArgument1 * doubleArgument2;
        }
        if (integerArgument1 != null && doubleArgument1 != null){
            return integerArgument1 * doubleArgument1;
        }
        System.out.println("Какая-то ошибка");
        return -1;
    }

    public double divide(){
        if (integerArgument1 != null && integerArgument2 != null && integerArgument2 != 0){
            return (double)integerArgument1 / integerArgument2;
        }
        if (doubleArgument1 != null && doubleArgument2 != null && doubleArgument2 != 0){
            return doubleArgument1 / doubleArgument2;
        }
        if (integerArgument1 != null && doubleArgument1 != null && doubleArgument1 != 0){
            return integerArgument1 / doubleArgument1;
        }
        System.out.println("Can not be divided by zero");
        return -1;
    }



    // операции с BigDecimal:

    public BigDecimal sumBigDecimal(){
        return new BigDecimal(bigDecimalOne.doubleValue() + bigDecimalTwo.doubleValue());
    }

    public BigDecimal subtractBigDecimal(){
        return new BigDecimal(bigDecimalOne.doubleValue() - bigDecimalTwo.doubleValue());
    }

    public BigDecimal multiplyBigDecimal(){
        return new BigDecimal(bigDecimalOne.doubleValue() * bigDecimalTwo.doubleValue());
    }

    public BigDecimal divideBigDecimal() {
        if (bigDecimalTwo.doubleValue() != 0) {
            return new BigDecimal(bigDecimalOne.doubleValue() + bigDecimalTwo.doubleValue());
        }
        System.out.println("Can not be divided by zero");
        return new BigDecimal(-1);
    }
}