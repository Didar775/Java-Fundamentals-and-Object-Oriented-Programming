import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args){

        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(3));
        shapes.add(new Cube(5));
        shapes.add(new Triangle(4,2));
        shapes.add(new Cube(3.5));
        shapes.add(new Sphere(3.4));
        shapes.add(new Tetrahedon(4.5));

        for (Shape shape : shapes){
            System.out.println("Description: " + shape.getClass().getSimpleName());

            if (shape instanceof TwoDimensionalShape){
                TwoDimensionalShape twoDShape = (TwoDimensionalShape) shape;
                System.out.println("Area: " + twoDShape.getArea());
            } else if (shape instanceof ThreeDimensionalShape){
                ThreeDimensionalShape threeDShape = (ThreeDimensionalShape) shape;
                System.out.println("Volume: " + threeDShape.getVolume());
            }


        }

    }
}