import java.util.*;

class FixingStringIndexOutOfBoundsException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        int index = scanner.nextInt();
        if(string!=null){
            if(index>=0 && index<string.length()){
                System.out.println(string.charAt(index));
            }else{
                System.out.println("Out of bounds!");
            }
        }else{
            System.out.println("Out of bounds!");
        }
    }
}