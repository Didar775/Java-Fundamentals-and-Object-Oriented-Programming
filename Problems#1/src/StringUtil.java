import java.util.Scanner;

public class StringUtil {
    public static void main(String[] args){

        System.out.println("Enter a string: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String result = extraUpperCaseLetters(input);
        System.out.println(result);


    }

    public static String  extraUpperCaseLetters(String input){
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++){
            char currentChar = input.charAt(i);

            // Check if the character is an uppercase letter
            if(currentChar >='A' && currentChar <= 'Z'){
                result.append(currentChar);
            }

        }

        return result.toString();

    }

}
