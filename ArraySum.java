public class ArraySum {
    public static void main (String args []){
        int arr[]= {3,5,13,7,9,11};
        int sum = 0;
        for(int i = 0;i<arr.length;i++) {   // time complexity: O(n)
            sum = sum+arr[i]; // time complexity: O(n)
        }
        System.out.println("Sum of array elements: " + sum);   // time complexity: O(1)
    }
}
//count the number of even and odd numbers in the list of elements