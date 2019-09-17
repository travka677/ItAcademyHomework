package lesson_9.task_4;

public class CalculatorTest {
    public static void main(String[] args) {

        Calculator <Double, Integer>calculator = new Calculator(38.9, 9);

        System.out.println(calculator.sum());
        System.out.println(calculator.subtract());
        System.out.println(calculator.multiply());
        System.out.println(calculator.divide());

    }
}
