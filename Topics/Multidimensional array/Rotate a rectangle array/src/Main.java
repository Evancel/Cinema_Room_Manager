import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();

        int[][] newArray = new int[arr[0].length][arr.length];
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0, a = arr.length - 1; j < newArray[i].length; j++, a--) {
                newArray[i][j] = arr[a][i];
            }
        }

        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0;j < newArray[i].length;j++) {
                System.out.print(newArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
