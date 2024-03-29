import java.util.Scanner;  // necessary import statement

import static java.lang.Math.*;


public class Main {

    public static void main(String[] args) {

        // Create new Scanner object for reading the input
        Scanner scanner = new Scanner(System.in);

        // Read a floating point number
        // USER INPUT REQUIRED HERE
        double d = scanner.nextDouble();

        // Round it down and square it
        // USER INPUT REQUIRED HERE
        int n = (int) floor(d);
        int result = (int) pow(n, 2);

        // Print the result
        // USER INPUT REQUIRED HERE
        System.out.println(result);

        // Remember to close the scanner to prevent resource leaks
        scanner.close();
    }
}