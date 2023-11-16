import java.util.Calendar;
import java.util.Scanner;

public class QuadricEquation {

    public static void main(String[] args){
        Scanner scanner  = new Scanner(System.in);

        System.out.print("Enter the coefficient a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the coefficient b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the coefficient c: ");
        double c = scanner.nextDouble();


        if (CalculateDiscriminant(a,b,c) > 0) {

            double d =CalculateDiscriminant(a,b,c);
            double[] roots = CalculateRootOfEquation(a, b, c, d);
            System.out.println("Root 1 : " + roots[0] + "\nRoot 2: " + roots[1]);
        }
        else {
            System.out.println("No roots of equation, because discrimination is negative!");
        }

    }

    public static double[] CalculateRootOfEquation(double a, double b, double c, double d){

        double root1 = (-b + Math.sqrt(d) / (2 * a));
        double root2 = (-b - Math.sqrt(d) / (2 * a));

        double[] roots = {root1,root2};

        return  roots;

    }

    public static double CalculateDiscriminant(double a, double b, double c){

        return  b *b - 4 * a * c;

    }
}
