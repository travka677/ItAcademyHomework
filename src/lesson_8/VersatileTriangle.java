package lesson_8;

// разносторонний треугольник

public class VersatileTriangle extends Triangles {

    public VersatileTriangle(double sideA, double sideB, double sideC){
        super(sideA, sideB, sideC);
    }

    @Override
    public double calculateArea() {
        double p = (getSideA() + getSideB() + getSideC()) / 2;
        return Math.sqrt(p*(p-getSideA())*(p-getSideB())*(p-getSideC()));
    }

    @Override
    public double height() {
        double p = (getSideA() + getSideB() + getSideC())/2;
        return 2 * Math.sqrt(p*(p-getSideA())*(p-getSideB())*(p-getSideC())) / getSideA();
    }
}
