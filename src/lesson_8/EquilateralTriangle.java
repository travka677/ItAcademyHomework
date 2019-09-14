package lesson_8;

// равносторонний треугольник

public class EquilateralTriangle extends Triangles {


    public EquilateralTriangle(double sideA){
        super(sideA);
    }

    @Override
    public double calculateArea() {
        return (getSideA()*getSideA()*Math.sqrt(3))/4;
    }

    @Override
    public double height() {
        return Math.sqrt(3)/2 * getSideA();
    }
}
