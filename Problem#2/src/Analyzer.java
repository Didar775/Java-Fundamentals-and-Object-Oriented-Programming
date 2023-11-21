import java.util.Scanner;

public class Analyzer {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Data data = new Data();

        while (true){
            System.out.print("Enter number (Q to quit): ");
            if(scanner.hasNextDouble()){
                double inputValue = scanner.nextDouble();
                data.add(inputValue);
            }
            else {
                String input = scanner.next();
                if (input.equalsIgnoreCase("Q")){
                    break;
                }
                else {
                    System.out.println("Invalid input. Please enter a number or 'Q' to quit.");
                }
            }

        }

        System.out.println("Average = " + data.getAverage());
        System.out.println("Maximum = " + data.getMaximum());

    }
}
