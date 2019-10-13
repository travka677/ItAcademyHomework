package lesson_17_lambda.Task_5;

/**
 * Дан класс Person с полями firstName, lastName, age.
 * Вывести полное имя самого старшего человека, у которого длина этого имени не превышает 15 символов.
 */
public class Person {

    private String firstName;
    private String lastName;
    private int age;


    Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

}
