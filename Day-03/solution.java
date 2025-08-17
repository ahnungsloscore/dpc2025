import java.util.Scanner;

public class findDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int size = sc.nextInt(); 
        int[] num = new int[size];
        System.out.println("Enter elements for the array: ");
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }
        int slow = num[0];// one step
        int fast = num[0]; //two step
        while (true){
            slow = num[slow];
            fast= num[num[fast]];
            if (slow == fast){
              break; // loop stops
            }
        }
        fast = num[0];
        while (slow != fast) {
            slow = num[slow];
            fast = num[fast];// now it takes one step
        }
        System.out.println("Duplicate number: " + slow);
    }
}
