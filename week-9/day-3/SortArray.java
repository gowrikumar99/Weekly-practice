import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SortArray{

    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();

        // Create an array of integers with the given size
        int[] array = new int[size];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Close the scanner object
        scanner.close();

        // Sort the array in descending order using a custom comparator
        Arrays.sort(array, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                // Reverse the natural order of comparison
                return b.compareTo(a);
            }
        });

        // Print the sorted array
        System.out.println("The sorted array is:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
