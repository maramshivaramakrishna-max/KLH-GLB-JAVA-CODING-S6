
//implement a java program to search an element in the list of elements using linear search and calculate Time complexity for each line
public class LinearSearch {
    
    public static int linearSearch(int[] arr, int target) {
        // Time Complexity: O(n)
        for (int i = 0; i < arr.length; i++) {    
            
            if (arr[i] == target) {         //time complexity: O(n)
                return i; 
            }
        }
        
            return -1; // Time Complexity: O(1)
        
    }

        public static void main(String[] args) {
        int[] array = {10, 5, 4, 3, 2, 1};             // Time Complexity: O(1)
        int target = 3;

        int result = linearSearch(array, target);       //  time complexity: O(n)
        if (target == array[result]) {            //time complexity: O(n)
            System.out.println("Element found at index:" + result + "    element is:"+ array[result]);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
    
}