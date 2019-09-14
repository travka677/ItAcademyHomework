package lesson_8;

public abstract class Quadrangle extends Shapes implements QuadrangleDiagonal{

    private double sideA;
    private double sideB;


    public Quadrangle(double sideA){

        if (sideA <= 0){
            throw new IllegalArgumentException("Incorrect side");
        }
        this.sideA = sideA;
    }

    public Quadrangle(double sideA, double sideB){

        if (sideA <= 0 || sideB <= 0){
            throw new IllegalArgumentException("Incorrect side");
        }
        this.sideB = sideB;
    }


    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }
}
