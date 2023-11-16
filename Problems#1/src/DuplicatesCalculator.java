import java.util.*;

public class DuplicatesCalculator {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = scanner.nextInt();
        int[] number = new int[n];

        System.out.println("Enter elemens of array ");

        for( int i = 0; i < n; i++){
            number[i] = scanner.nextInt();
        }

        List<List<Integer>> result = calculateDuplicates(number);

        for (List<Integer> pair: result){
            System.out.println(pair);
        }


    }

    public static List<List<Integer>> calculateDuplicates(int[] arr){

        Map<Integer,Integer> elementCounts = new HashMap<>();

        for(int element: arr){
            elementCounts.put(element,elementCounts.getOrDefault(element,0)+1);

        }

        List<List<Integer>>result = new ArrayList<>();
        for (Map.Entry<Integer,Integer>entry: elementCounts.entrySet()){
            List<Integer> pair = new ArrayList<>();
            pair.add(entry.getKey());
            pair.add(entry.getValue());
            result.add(pair);

        }

        return result;


    }

}
