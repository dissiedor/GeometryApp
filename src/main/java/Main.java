import org.example.geometry.Circle;
import org.example.geometry.Triangle;
import org.example.geometry.Rectangle;
import org.example.geometry.threedimensional.Cube;
import org.example.geometry.threedimensional.Sphere;

import org.example.geometry.utils.GeometryUtils;
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(3,5,7);
        Rectangle rectangle = new Rectangle(6,8);
        Cube cube = new Cube(5);
        Sphere sphere = new Sphere(3);

        System.out.println(circle.calculateArea());
        System.out.println(circle.getDiameter());
        System.out.println(circle.calculatePerimeter());
        System.out.println(triangle.calculateArea());
        System.out.println(triangle.calculatePerimeter());
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());
        System.out.println(GeometryUtils.centimetersToMeters(2500));
        System.out.println(GeometryUtils.metersToCentimeters(25));
        System.out.println(cube.calculateSurfaceArea());
        System.out.println(cube.calculateVolume());
        System.out.println(cube.getSpaceDiagonal());
        System.out.println(sphere.calculateSurfaceArea());
        System.out.println(sphere.calculateVolume());
    }
}
