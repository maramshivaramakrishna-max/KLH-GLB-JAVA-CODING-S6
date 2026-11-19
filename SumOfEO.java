//count the number of even and odd numbers in the list of elements
public class SumOfEO {
    public static void main(String[] args) {
        int arr[] = {3, 5,8,4,6, 13, 7, 9, 11};// time complexity: O(1) 
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < arr.length; i++) {  // time complexity: O(n) because it iterates through the entire array
            if (arr[i] % 2 == 0) {             // time complexity: O(n) because it is inside the loop
                evenCount++;  // time complexity: O(1) because it is a simple increment operation
            } else {
                oddCount++;       // time complexity: O(1) because it is a simple increment operation
            }
        }

        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
    }
}
