package lesson_4.task_1;

public class TimeInterval_test {
    public static void main(String[] args) {

        TimeInterval intervalOne = new TimeInterval(3112);
        intervalOne.countSeconds();

        TimeInterval intervalTwo = new TimeInterval(0,60,60);
        intervalTwo.countSeconds();

        intervalOne.output();
        intervalTwo.output();

    }
}
