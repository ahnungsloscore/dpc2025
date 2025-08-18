import java.util.Arrays;
import java.util.Scanner;

public class mergeSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input arr1
        System.out.print("Enter size of arr1: ");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("Enter elements of arr1:");
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }
        // Input arr2
        System.out.print("Enter size of arr2: ");
        int size2 = sc.nextInt();
        int[] arr2 = new int[n];
        System.out.println("Enter elements of arr2:");
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }
        int i = 0, j = 0;
        while (i < size1 && j < size2) {
            if (arr1[i] > arr2[j]) {
                // Swap
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
                Arrays.sort(arr2);
            }
            i++;
        }
        // Print result
        System.out.print("Merged arr1: ");
        for (int k = 0; k < arr1.length; k++) {
            System.out.print(arr1[k] + " ");
        }
        System.out.println();
        System.out.print("Merged arr2: ");
        for (int k = 0; k < arr2.length; k++) {
            System.out.print(arr2[k] + " ");
        }
        System.out.println();
    }
}
