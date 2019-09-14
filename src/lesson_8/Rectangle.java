package lesson_8;

public class Rectangle extends Quadrangle {

    public Rectangle(double sideA, double sideB){
        super(sideA, sideB);
    }


    @Override
    public double calculateArea() {
        return getSideA()*getSideB();
    }

    @Override
    public double diagonal() {
        return Math.sqrt(Math.pow(getSideA(), 2) + Math.pow(getSideB(), 2));
    }
}
