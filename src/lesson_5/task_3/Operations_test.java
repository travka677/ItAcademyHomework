package lesson_5.task_3;

public class Operations_test {
    public static void main(String[] args) {

        Operations operations = new Operations(365,44.56);
        System.out.println(operations.multiply());


        System.out.println(operations.divideBigDecimal());
    }
}
