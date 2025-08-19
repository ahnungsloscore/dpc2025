import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class findLeaders {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of array: ");
    int size = sc.nextInt();
    //Create an array
    int[] arr = new int[size];
    //Take input for array elements
    System.out.println("Enter elements of array:");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    //list to store leaders
    ArrayList<Integer> leaders = new ArrayList<>();
    //Last element is always a leader
    int maxRight = arr[size - 1];
    leaders.add(maxRight);
    //Traverse array from right to left
    for (int i = size - 2; i >= 0; i--) {
      if (arr[i] > maxRight) {
        leaders.add(arr[i]);
        maxRight = arr[i];
      }
    }
    //Reverse the list for order 
    Collections.reverse(leaders);
    //Print the leaders
    System.out.println("Leaders: " + leaders);
    }
}


  
 
