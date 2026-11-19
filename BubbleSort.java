import java.util.Arrays;
public class BubbleSort{ 
    public static void  sortArray(int [] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){  // time complexity: O(nsquare)
                if(arr[j] > arr[j+1]){
                 
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        }
        public static void main(String args[]){
            int [] array = {10, 5, 4, 3, 2, 1};
            
            System.out.println(" Original array: " + Arrays.toString(array));
            sortArray(array);
            System.out.println("Sorted array: " + Arrays.toString(array));
    }

}