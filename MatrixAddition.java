
// implement a java program for addition of two matrices and calculate Time complexity for each line
public class MatrixAddition {
    
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
     
        int rows = matrix1.length; 
        int cols = matrix1[0].length; // Time Complexity: O(1)
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length; // Time Complexity: O(1) 
       
        int[][] result = new int[rows][cols]; // Time Complecity: O(n) where n is the number of rows

        for (int i = 0; i < rows; i++) { 
            for (int j = 0; j < cols; j++) { 
                result[i][j] = matrix1[i][j] + matrix2[i][j];      // time complexity: O(n square)
            }
        }

        return result; // Time Complexity: O(n)
    }

    public static void main(String[] args) {
        int[][] matrix1 = {
            {1, 2, 3}, {4, 5, 6}, {7, 8, 9}
        };

        int[][] matrix2 = {
            {9, 8, 7}, {6, 5, 4},{3, 2, 1}
        };

        int[][] sumMatrix = addMatrices(matrix1, matrix2); // Time Complexity: O(nsquare)

        System.out.println("Sum of the two matrices:");
        for (int i = 0; i < sumMatrix.length; i++) { 
            for (int j = 0; j < sumMatrix[0].length; j++) {    // time complexity: O(nsquare)
                System.out.print(sumMatrix[i][j] + " "); 
            }
             System.out.println(); 
        }
    }
    
}
