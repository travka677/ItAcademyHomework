package lesson_17_lambda.Task_5;

import java.util.List;

@FunctionalInterface
public interface Printable {
    List<String> print(List<Person> list);
}
