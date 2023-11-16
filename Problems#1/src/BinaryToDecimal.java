import java.util.Scanner;

public class BinaryToDecimal {

    public static void main(String[] args){

        System.out.println("Enter your binary number: ");

        Scanner scanner = new Scanner(System.in);
        String binary = scanner.next();

        int number = getDecimalNumber(binary);

        System.out.println(number);

    }

    public static int getDecimalNumber(String binary){

        int result = 0;


        for(int i = 0; i < binary.length(); i++){

            char currentElement = binary.charAt(binary.length()-1-i);

            result += (Character.getNumericValue(currentElement) * Math.pow(2,i));

        }

        return result;
    }

}
