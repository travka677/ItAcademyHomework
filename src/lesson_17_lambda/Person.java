package lesson_17_lambda;

/**
 * Дан класс Person с полями firstName, lastName, age.
 * Вывести полное имя самого старшего человека, у которого длина этого имени не превышает 15 символов.
 */

import java.util.*;
import java.util.stream.Stream;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    int getAge() {
        return age;
    }

    public static void main(String[] args) {

        List<Person> list = Arrays.asList(
                new Person("alexandrina", "ivanova", 45),
                new Person("dasha", "ivanova", 20),
                new Person("dima", "petrov", 17),
                new Person("oleg", "juk", 14),
                new Person("gena", "bukin", 35)
        );

        int age = list.stream()
                .filter(person -> person.getFirstName().length() + person.getLastName().length()<15)
                .mapToInt(value -> value.age)
                .max().getAsInt();
        for (Person p : list){
            if (age==p.age){
                System.out.println(p.firstName + " " + p.lastName);
            }
        }
    }
}