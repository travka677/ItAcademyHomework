package lesson_9.task_1_and_task_2;

/**
 * @author Daniil Kim
 *
 * Создать класс Pair, параметризованный двумя параметрами K и V.
 * Класс должен хранить две переменные типов K и V соответственно.
 * У класса должен быть конструктор, принимающий 2 параметра типов K и V,
 * а также набор соответствующих геттеров/сеттеров.
 *
 */

public class Pair<K, V> {

    private K variableOne;
    private V variableTwo;

    Pair(K variableOne, V variableTwo){
        this.variableOne = variableOne;
        this.variableTwo = variableTwo;
    }

    public K getVariableOne() {
        return variableOne;
    }

    public void setVariableOne(K variableOne) {
        this.variableOne = variableOne;
    }

    public V getVariableTwo() {
        return variableTwo;
    }

    public void setVariableTwo(V variableTwo) {
        this.variableTwo = variableTwo;
    }
}
