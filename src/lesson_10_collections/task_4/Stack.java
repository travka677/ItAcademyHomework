package lesson_10_collections.task_4;

/**
 * @author Daniil Kim
 *
 * Ввести с консоли число, занести его цифры в стек. Стек – самостоятельно спроектированный класс, поддерживающий 3 операции:
 * Задать размер стека.
 * Внести цифру в стек.
 * Извлечь цифру из стека.
 * Вывести число, у которого цифры идут в обратном порядке.
 *
 */

public class Stack {

    private int size;
    private int[] stackArray;
    private int top;


    Stack(int size){
        this.size = size;
        stackArray = new int[this.size];
        top = -1;
    }


    public void setSize(int size) {
        this.size = size;
    }


    public void push(int num){
        stackArray[++top] = num;
    }


    public int pop(){
        return stackArray[top--];
    }

    public boolean isEmpty(){
        return (top == -1);
    }


    public void printStack(){
        while (!isEmpty()){
            System.out.print(pop());
        }
    }
}
