package lesson_9.task_4;

/**
 * @author Daniil Kim
 *
 * Из задания 5.3 реализовать класс вычислитель для вещественных и целых типов данных,
 * используя параметризацию классов.
 */

public class Calculator <T extends Number, V extends Number>{

    private T arg1;
    private V arg2;


    Calculator(T arg1, V arg2){
        this.arg1 = arg1;
        this.arg2 = arg2;
    }


     double sum() {
        if (arg1 != null && arg2 != null){
            return arg1.doubleValue() + arg2.doubleValue();
        }
        System.out.println("Error");
        return -1;
    }

    double subtract(){
        if (arg1 != null && arg2 != null){
            return arg1.doubleValue() - arg2.doubleValue();
        }
        System.out.println("Error");
        return -1;
    }

    double multiply(){
        if (arg1 != null && arg2 != null){
            return arg1.doubleValue() * arg2.doubleValue();
        }
        System.out.println("Error");
        return -1;
    }

    double divide(){
        if (arg1 != null && arg2 != null && arg2.doubleValue() != 0){
            return arg1.doubleValue() / arg2.doubleValue();
        }
        System.out.println("Can not be dividing by zero");
        return -1;
    }
}

