package lesson_16.task_2_and_task_3;

import java.io.Serializable;

public class Touchpad implements Serializable {

    private static final long serialVersionUID = 12466557645L;

    private double sensitivity;
    private double area;

    public Touchpad(double sensitivity, double area) {
        this.sensitivity = sensitivity;
        this.area = area;
    }



    @Override
    public String toString() {
        return " Touchpad: {sensitivity: "+sensitivity+"} {area:"+area+"}";
    }
}
