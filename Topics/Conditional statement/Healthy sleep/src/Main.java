import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int minSleepHours = scanner.nextInt();
        int maxSleepHours = scanner. nextInt();
        int factSleepHours = scanner.nextInt();

        if(factSleepHours < minSleepHours){
            System.out.println("Deficiency");
        } else if(factSleepHours > maxSleepHours){
            System.out.println("Excess");
        } else{
            System.out.println("Normal");
        }
    }
}