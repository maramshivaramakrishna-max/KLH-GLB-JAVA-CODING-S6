public class Factorial {

    // The recursive method to calculate factorial
    public static int calculateFactorial(int n) {
        if (n == 0 || n == 1) {             //time complexity: O(n)
            return 1;
        }

        return n * calculateFactorial(n - 1);   // time complexity: O(n)
    }

    public static void main(String[] args) {
      
      
        int result = calculateFactorial(5); // time complexity: O(n)

        System.out.println("The factorial of 5 is: " + result);
    }
}

// try to display stars in star pattern