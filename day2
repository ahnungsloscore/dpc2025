import java.util.Scanner;

public class missingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" "); // taking input like 1 2 4 5
        int[] array = new int[input.length]; // conversion from string to array
        for (int i = 0; i < input.length; i++) {
            array[i] = Integer.parseInt(input[i]); // conversion to int
        }
        int n = array.length + 1; 
        // Since one number is missing total numbers = array.length + 1, if array has 4 elements, n = 5
        int total = n * (n + 1) / 2; 
        // Calculate sum of element
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i]; 
        }
        int missingValue = total - sum; 
        System.out.println("Missing number: " + missingValue);
    }
}
