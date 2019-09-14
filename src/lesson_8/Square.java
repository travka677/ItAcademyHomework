package lesson_8;

public class Square extends Quadrangle {

    public Square(double sideA){
        super(sideA);
    }

    @Override
    public double calculateArea() {
        return Math.pow(getSideA(), 2);
    }


    @Override
    public double diagonal() {
        return getSideA() * Math.sqrt(2);
    }
}
