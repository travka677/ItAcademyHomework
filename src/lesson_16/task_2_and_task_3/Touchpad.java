package lesson_16.task_2_and_task_3;

import java.io.Serializable;

public class Touchpad implements Serializable {

    private double sensitivity;

    public Touchpad(double sensitivity, double area) {
        this.sensitivity = sensitivity;
        this.area = area;
    }

    private double area;

    @Override
    public String toString() {
        return " Touchpad: {sensitivity: "+sensitivity+"} {area:"+area+"}";
    }
}
