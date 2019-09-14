package lesson_8;

/**
 * - Создать класс ShapeUtils со статическими методами:
 *
 *   1. Определяющим, является ли фигура прямоугольником.
 *   2. Определяющим, является ли фигура треугольником.
 */

public class ShapeUtils {

    // определяет, является ли фигура ЧЕТЫРЕХУГОЛЬНИКОМ
    public static boolean isQuadrangle(Shapes shape){

        if (shape instanceof Quadrangle){
            return true;
        }
        return false;
    }

    public static boolean isTriangle(Shapes shape){

        if (shape instanceof Triangles){
            return true;
        }
        return false;
    }
}
