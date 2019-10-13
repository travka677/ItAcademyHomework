package lesson_17_lambda.Task_5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Daniil Kim
 * Дан класс Person с полями firstName, lastName, age.
 * Вывести полное имя самого старшего человека, у которого длина этого имени не превышает 15 символов.
 */

public class PersonDemo {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Daniil", "Kim", 20));
        people.add(new Person("Ivan", "I", 14));
        people.add(new Person("Kolya", "K", 41));
        people.add(new Person("Anya", "A", 60));
        people.add(new Person("Denis", "D", 60));

        Printable printPerson = list -> {
            List<String> names = new ArrayList<>();
            String name;
            for (Person person : list){
                if (theBiggestCorrectAge(list) == -1){
                    break;
                } else if (person.getAge() == theBiggestCorrectAge(list)){
                    name = person.getFirstName()+" "+person.getLastName();
                    names.add(name);
                }
            }
            return names;
        };

        System.out.println(printPerson.print(people));

    }

    public static int theBiggestCorrectAge(List<Person> list) {
        int max = -1;
        for (Person p : list){
            if (p.getFirstName().length()+p.getLastName().length() <= 15){
                max = p.getAge();
                break;
            }
        }
        if (max != -1){
            for (Person p : list){
                if (p.getFirstName().length()+p.getLastName().length() <= 15) {
                    if (p.getAge() > max) {
                        max = p.getAge();
                    }
                }
            }
            return max;
        }else {
            return max;
        }
    }
}
