import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int year = scanner.nextInt();
        scanner.close();

        boolean isLeapYear = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
        if (year >= 1900 && year <= 3000) {
            if (isLeapYear) {
                System.out.println("Leap");
            } else {
                System.out.println("Regular");
            }
        } else {
            System.out.println("The entered year should be between 1900 and 3000!");
        }
    }
}