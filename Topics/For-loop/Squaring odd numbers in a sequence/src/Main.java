import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Read the input integer n

        // Your code should be here to iterate n times
        // For each iteration you need to check if the current iteration number is odd
        // If yes, print the square of the current iteration number, else print the iteration number itself
        // Remember to use the ternary operator as per the problem description

        scanner.close();

        for (int i = 1; i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            } else{
                System.out.println((int) pow(i,2));
            }
        }
    }
}