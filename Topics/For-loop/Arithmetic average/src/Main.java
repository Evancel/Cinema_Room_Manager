import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        scanner.close();

        int sum = 0;
        int count = 0;
        double avg = 0;

        for (int i = a; i<=b; i++){
            if (i%3==0){
                sum+=i;
                count++;
            }
        }
        if(count!=0){
            avg = (double) sum/count;
        }

        System.out.println(avg);
    }
}