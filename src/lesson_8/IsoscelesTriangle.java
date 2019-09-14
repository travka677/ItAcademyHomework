package lesson_8;

// равнобедренный треугольник

public class IsoscelesTriangle extends Triangles {

    public IsoscelesTriangle(double sideA, double sideB){
        super(sideA, sideB);
    }

    @Override
    public double height() {
        return Math.sqrt(Math.pow(getSideA(), 2) - (Math.pow(getSideB(), 2))/4);
    }

    @Override
    public double calculateArea() {
        return getSideB()*height()/2;
    }


}
