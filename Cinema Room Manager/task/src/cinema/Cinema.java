package cinema;

import java.util.Locale;
import java.util.Scanner;

public class Cinema {

    static Scanner sc = new Scanner(System.in);
    static int countPurchasedTickets = 0;
    static int currentIncome = 0;

    public static void main(String[] args) {
        char[][] cinemaArray = createCinemaArr();

        System.out.println();

        int choise = -1;
        do{
            choise = showMenu(cinemaArray);
        }while(choise!=0);

        sc.close();
    }

    public static int showMenu(char[][] arr){
        System.out.println("1. Show the seats");
        System.out.println("2. Buy a ticket");
        System.out.println("3. Statistics");
        System.out.println("0. Exit");
        System.out.print("> ");

        int action = sc.nextInt();

        switch(action){
            case 1 -> showSeats(arr);
            case 2 -> buyTicket(arr);
            case 3 -> showStatistics(arr);
            case 0 -> exit();
        }
        return action;
    }

    public static void showSeats(char[][] arr){
        System.out.println();
        System.out.println("Cinema:");
        System.out.print(" ");
        for(int k = 1; k<=arr[0].length; k++){
            System.out.print(" " + k);
        }

        System.out.println();
        for(int i = 0; i< arr.length; i++){
            System.out.print(i+1);
            for(int j = 0; j< arr[i].length; j++){
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void buyTicket(char[][] arr){
        int rowNumber = 0;
        int seatNumber = 0;
        boolean goodInput;

        System.out.println();

        do {
            goodInput = true;
            System.out.println("Enter a row number:");
            System.out.print("> ");
            rowNumber = sc.nextInt();

            System.out.println("Enter a seat number in that row:");
            System.out.print("> ");
            seatNumber = sc.nextInt();

            if (rowNumber <= 0 || rowNumber > arr.length || seatNumber <= 0 || seatNumber > arr[0].length) {
                goodInput = false;
                System.out.println();
                System.out.println("Wrong input!");
                System.out.println();
            } else if(arr[rowNumber-1][seatNumber-1]=='B'){
                goodInput = false;
                System.out.println();
                System.out.println("That ticket has already been purchased!");
                System.out.println();
            }
        }while(!goodInput);

        int ticketPrice = calculateTicketPrice(arr, rowNumber);
        System.out.println();
        System.out.printf("Ticket price: $%d%n", ticketPrice);
        System.out.println();

        updateCinemaArray(arr, rowNumber, seatNumber);
        countPurchasedTickets++;
        currentIncome += ticketPrice;
    }

    public static int calculateTicketPrice(char[][] arr, int rowNumber){
        int rows = arr.length;;
        int seats = arr[0].length;

        int ticketPrice = 0;
        int price1 = 10;
        int price2 = 8;

        if((rows*seats<=60) || (rowNumber<=rows/2)){
            ticketPrice = price1;
        } else {
           ticketPrice=price2;
        }

        return ticketPrice;
    }

    private static char[][] createCinemaArr(){
        System.out.println();
        System.out.println("Enter the number of rows:");
        System.out.print("> ");
        int rows = sc.nextInt();
        if(rows<=0 || rows>9){
            System.out.println("The entered numbers of rows should be between 1 and 9");
        }

        System.out.println("Enter the number of seats in each row:");
        System.out.print("> ");
        int seats = sc.nextInt();
        if(seats<=0 || seats>9){
            System.out.println("The entered numbers of seats should be between 1 and 9");
        }

        char[][] cinemaArr = new char[rows][seats];
        for(int i = 0; i< cinemaArr.length; i++){
            for(int j = 0; j< cinemaArr[i].length; j++){
                cinemaArr[i][j] = 'S';
            }
        }

        return cinemaArr;
    }

    private static void updateCinemaArray(char[][] arr, int rowNumber, int seatNumber){
        arr[rowNumber-1][seatNumber-1] = 'B';
    }

    public static void showStatistics(char[][] arr){
        Locale.setDefault(Locale.ENGLISH);
        System.out.println();
        System.out.printf("Number of purchased tickets: %d%n",countPurchasedTickets);

        int countAllSeats = arr.length * arr[0].length;
        double percentageOccupancy = (double)countPurchasedTickets / countAllSeats*100.00;
        System.out.printf("Percentage: %.2f%%%n",percentageOccupancy);

        System.out.printf("Current income: $%d%n",currentIncome);

        int totalIncome = countTotalCost(arr);
        System.out.printf("Total income: $%d%n",totalIncome);
        System.out.println();
    }

    public static void exit(){
        System.out.println();
    }

    public static int countTotalCost(char[][] arr){
        int rows = arr.length;
        int seats = arr[0].length;

        int totalCost = 0;
        int price1 = 10;
        int price2 = 8;

        if(rows>0 && rows<10 && seats>0 && seats<10 ){
            if(rows*seats<=60){
                totalCost = rows*seats*price1;
            } else{
                int firstHalfRows = rows/2;
                totalCost = firstHalfRows *seats*price1  + (rows-firstHalfRows)*seats*price2;
            }
        }else{
            System.out.println("The entered numbers should be between 1 and 9");
        }
        return totalCost;
    }
}