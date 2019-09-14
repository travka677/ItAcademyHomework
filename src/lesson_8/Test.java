package lesson_8;

/**
 * @author Daniil Kim
 *
 * Создать иерархию классов, описывающих геометрические фигуры на плоскости.
 *
 * - Можно пользоваться результатами предыдущего ДЗ.
 * - В иерархии должно быть не менее 10 классов/интерфейсов и хотя бы 2 уровня вложенности.
 * - Продемонстрировать переопределение методов в иерархии.
 * - Продемонстрировать добавление собственных методов в классах-наследниках (можно с помощью интерфейсов).
 * Например, расчёт диагонали в прямоугольнике, расчёт высоты в треугольнике.
 * - При разработке иерархии держать в уме принцип инкапсуляции, выбирать корректные имена классов и методов,
 * пользоваться преимуществами полиморфизма.
 * - Отдавайте предпочтение интерфейсам, а не абстрактным классам.
 * - При переопределении методов обязательно использовать аннотацию @Override
 * - Не создавать лишних классов в системе (полностью дублирующих или не содержащих назначения)
 * - Каждый класс должен выполнять своё назначение.
 *
 * - Создать общие методы:
 * 1. Рассчитывающий площадь фигуры.
 * 2. Принимающий в качестве параметра фигуру и определяющий, равны ли площади текущей и полученной фигуры.
 *
 * - Создать класс ShapeUtils со статическими методами:
 *
 * 1. Определяющим, является ли фигура прямоугольником.
 * 2. Определяющим, является ли фигура треугольником.
 *  
 * - Для каждого неабстрактного класса переопределить метод toString() класса для представления информации
 * о классах в строковой форме.
 */


public class Test {
    public static void main(String[] args) {

        // круг
        Shapes circle = new Circle(4);
        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println(circle.toString());



        // прямоугольник
        Quadrangle rectangle = new Rectangle(4.7,5);
        System.out.println("\nRectangle area: " + rectangle.calculateArea());
        System.out.println("Rectangle diagonal: " + rectangle.diagonal());
        System.out.println(rectangle.toString());


        // compareAreas()
        System.out.println(circle.compareAreas(circle));
        System.out.println(rectangle.compareAreas(circle));





        // равнобедренный треугольник
        Triangles isoscelesTriangle = new IsoscelesTriangle(4.3, 6);
        System.out.println("\nIsosceles Triangle area: " + isoscelesTriangle.calculateArea());
        System.out.println("Isosceles Triangle height: " + isoscelesTriangle.height());
        System.out.println(isoscelesTriangle.toString());


        Triangles versatileTriangle = new VersatileTriangle(7,5,9);
        System.out.println(versatileTriangle.calculateArea());
        System.out.println(versatileTriangle.height());

        System.out.println();



        // ShapeUtils
        System.out.println(ShapeUtils.isQuadrangle(rectangle));
        System.out.println(ShapeUtils.isTriangle(rectangle));



    }
}
