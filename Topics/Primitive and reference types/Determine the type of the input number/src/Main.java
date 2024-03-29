import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Place your code here
        if(sc.hasNextInt()){
            int num = sc.nextInt();
            if(num>0){
                System.out.println("positive");
            }else if(num<0){
                System.out.println("negative");
            }else{
                System.out.println("zero");
            }
        }else{
            System.out.println("non-integer");
        }

        sc.close();
    }
}