package lesson_8;

public abstract class Triangles extends Shapes implements TriangleHeight{

    private double sideA;
    private double sideB;
    private double sideC;


    public Triangles(double sideA){

        if (sideA <= 0){
            throw new IllegalArgumentException("Incorrect side");
        }
        this.sideA = sideA;
    }

    public Triangles(double sideA, double sideB){

        if (sideA <= 0 || sideB <= 0 || sideB > 2*sideA){
            throw new IllegalArgumentException("Incorrect side");
        }
        this.sideA = sideB;
        this.sideB = sideB;
    }

    public Triangles(double sideA, double sideB, double sideC){

        if (sideA <= 0 || sideB <= 0 || sideC <= 0 || sideC > sideA+sideB){
            throw new IllegalArgumentException("Incorrect side");
        }
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }


    public double getSideA() {
        return sideA;
    }
    public double getSideB() {
        return sideB;
    }
    public double getSideC() {
        return sideC;
    }

}
