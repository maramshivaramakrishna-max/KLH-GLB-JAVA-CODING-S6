// try to display stars in star pattern


public class StarPattern {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the star pattern

        for (int i = 1; i <= rows; i++) { // time complexity: O(n)
            for (int j = 1; j <= i; j++) { // time complexity: O(n)
                System.out.print("* "); // Print star
            }
            System.out.println(); // Move to the next line after each row
        }
    }
    
}
