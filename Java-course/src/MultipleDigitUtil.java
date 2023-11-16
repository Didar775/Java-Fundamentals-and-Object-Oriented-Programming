import java.util.Scanner;

public class MultipleDigitUtil {
    public static void main(String[] args){

        System.out.println("Enter your multiple-digit integer to get sum of digits: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int result = getSumOfDigits(number);
        System.out.println(result);
    }

    public static int getSumOfDigits(int n){
        int sum = 0;

        n = Math.abs(n);

        while (n > 0){
            int lastDigit = n % 10;
            sum += lastDigit;
            n/=10;
        }

        return sum;
    }

}
