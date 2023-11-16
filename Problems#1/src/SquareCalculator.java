import java.util.Calendar;
import java.util.Scanner;

public class SquareCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the side length of the square:  ");

        double length = scanner.nextDouble();

        double area = CalculateArea(length);
        double perimeter = CalculatePerimeter(length);
        double diagonal = CalculateDiagonal(length);

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Diagonal: " + diagonal);


    }

    public static double CalculateArea(double a){
        return  a*a;
    }

    public static double CalculatePerimeter(double a){
        return  4 * a;
    }

    public static double CalculateDiagonal(double a){
        return  Math.sqrt(a) * a;
    }
}
