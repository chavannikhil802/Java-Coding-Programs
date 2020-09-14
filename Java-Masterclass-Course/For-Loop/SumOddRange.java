public class SumOddRange {
    public static void main(String[] args) {

        System.out.println("Sum of Odd Numbers is : "+sumOdd(1,20));
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if(!((start>0) && (end>0) && (end>=start))) {
            System.out.println("Invalid Input!!!!");
        }
        else {
            for(int i=start;i<=end;i++) {
                if(isOdd(i) == true) {
                    sum = sum + i;
                }
            }
        }
        return sum;
    }

    public static boolean isOdd(int number) {
        if(number%2==1) {
            return true;
        }
        return false;
    }
}
