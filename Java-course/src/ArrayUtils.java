public class ArrayUtils {

    public static void main(String[] args) {
        // Example usage
        int[] dataArray = {1, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 5};
        int lastIndex = findLastNonZeroIndex(dataArray);

        if (lastIndex != -1) {
            int lastElement = dataArray[lastIndex];
            System.out.println("Last non-zero element: " + lastElement);
        } else {
            System.out.println("No non-zero elements found.");
        }
    }

    public static int findLastNonZeroIndex(int[] array) {
        int lastNonZeroIndex = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                lastNonZeroIndex = i;
            }
        }

        return lastNonZeroIndex;
    }
}
