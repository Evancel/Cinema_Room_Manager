class FixingExceptions {

    public static void calculateSquare(int[] array, int index) {
        // write your code here
        if(array!=null){
            if(index>=0 && index< array.length){
                System.out.println((int)Math.pow(array[index],2));
            }else{
                System.out.println("Exception!");
            }
        }else{
            System.out.println("Exception!");
        }
    }
/*
    public static void main(String[] args) {
        int[] arr = new int[]{12,3};
        int ind = 0;
        calculateSquare(arr,ind);
    }
 */
}