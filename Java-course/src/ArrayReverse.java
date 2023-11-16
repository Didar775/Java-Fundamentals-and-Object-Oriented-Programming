import java.util.Scanner;

public class ArrayReverse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       int n =  scanner.nextInt();
       int[] numbers = new int[n];

       for (int i = 0; i < n; i++){

           numbers[i] = scanner.nextInt();
       }

       numbers = getReverseArray(numbers);

       for(int element : numbers){
           System.out.print(element + " ");
       }


    }


   public static int[] getReverseArray(int[] numbers){

        int[] reverse = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++){

            reverse[numbers.length - i - 1] = numbers[i];

        }

        return reverse;
   }

    

}