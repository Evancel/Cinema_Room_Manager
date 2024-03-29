import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;

        for(int i = 0; i<n; i++){
            String grade = scanner.next();
            if(grade.equals("A")){
                count1++;
            } else if(grade.equals("B")){
                count2++;
            } else if (grade.equals("C")) {
                count3++;
            } else if (grade.equals("D")) {
                count4++;
            }else{
                System.out.println("Inappropriate value. Grades can be A,B,C or D.");
            }
        }

        System.out.println(count4 + " " + count3 + " " + count2 + " " + count1 + " ");

    }
}