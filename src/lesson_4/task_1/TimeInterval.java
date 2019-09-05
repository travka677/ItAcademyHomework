package lesson_4.task_1;

/**
 * @author Daniil Kim
 * 1. Создать класс, описывающий промежуток времени.
 * Сам промежуток времени должен задаваться тремя свойствами: секундами, минутами и часами.
 * Создать метод для получения полного количества секунд в объекте
 * Создать два конструктора: первый принимает общее количество секунд, второй - часы, минуты и секунды по отдельности.
 * Создать метод для вывода данных. 
 * Написать программу для тестирования возможностей класса.
 */

public class TimeInterval {
    private int seconds;
    private int minutes;
    private int hours;

    public TimeInterval(int seconds){
        this.seconds = seconds;
    }
    public TimeInterval(int hours, int minutes, int seconds){
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public void countSeconds(){
        int seconds = this.seconds + (this.minutes*60) + (this.hours*3600);
        System.out.println(seconds + " секунд");
    }

    public void output() {

        int  seconds = 0, minutes = 0, hours = 0;

        if (this.seconds >= 60) {
            minutes = this.seconds / 60 + this.minutes;
            seconds = this.seconds % 60;
            if (minutes >= 60){
                hours = this.hours + minutes/60;
                minutes = minutes%60;
            } else {
                hours = this.hours;
            }
        } else {
            seconds = this.seconds;
            if (this.minutes >= 60){
                hours = this.hours + this.minutes/60;
                minutes = this.minutes%60;
            } else {
                minutes = this.minutes;
                hours = this.hours;
            }
        }
        System.out.println("Данный интервал был задан как: " + this.hours + "h:" + this.minutes + "m:" + this.seconds + "s");
        System.out.format("Корректное отображение интервала: " +hours+"h:"+minutes+"m:"+seconds+"s");
        System.out.println();

    }
}
