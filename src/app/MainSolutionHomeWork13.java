package app;

import app.models.Circle;
import app.models.Square;
import app.models.Triangle;
import app.service.Shape;

public class MainSolutionHomeWork13 {

    public static void main(String[] args) {
        double a = 2.3;
        double b = 3.5;
        double r = 4.2;

        Shape circle = new Circle(r);
        Shape triangle = new Triangle(a,b);
        Shape square = new Square(a);

        System.out.printf("Area of circle = %.2f %n", circle.getArea());
        System.out.printf("Area of triangle = %.2f %n", triangle.getArea());
        System.out.printf("Area of square = %.2f %n", square.getArea());
        System.out.println(" ");

        Shape[] areas = new Shape[]{circle,triangle,square};
        System.out.printf("Summa of areas = %.2f %n", calculateAreas(areas));

    }
    private static double calculateAreas (Shape[] array){
        double sum = 0;
        for(Shape item : array){
          sum += item.getArea();
        }
        return sum;
    }
}
