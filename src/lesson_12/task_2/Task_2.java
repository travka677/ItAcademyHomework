package lesson_12.task_2;

/**
 * @author Daniil Kim
 * Написать код, который создаст, а затем отловит ArrayIndexOutOfBoundsException.
 */

public class Task_2 {
    public static void main(String[] args) {


        int i = 0;
        int[] array = new int[5];

        while(true) {
            try {
                array[i] = i;
            }
            catch(ArrayIndexOutOfBoundsException ex) {
                ex.printStackTrace();
                break;
            }

            System.out.print(i);
            i++;
        }

    }
}
