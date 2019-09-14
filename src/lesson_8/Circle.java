package lesson_8;

public class Circle extends Shapes {

    private static final double PI = Math.PI;
    private double radius;

    public Circle(double radius) {

        if (radius <= 0){
            throw new IllegalArgumentException("Incorrect side");
        }
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return PI * Math.pow(radius, 2);
    }
}
