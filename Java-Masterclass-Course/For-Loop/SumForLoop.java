// PROGRAM TO FIND THE FIRST FIVE NUMBERS WHICH ARE DIVISIBE BY 3 AND 5
// THEN, ADDING THOSE FIRST FIVE NUMBERS.

public class SumForLoop {
    public static void main(String[] args) {
        int count = 0,sum=0;

        for(int i=1;i<=1000;i++) {
            if((i%3==0) && (i%5==0)) {
                count++;
                sum = sum+i;
                System.out.println("Found Number : "+i);
            }
            if(count == 5) {
                break;
            }
        }
        System.out.println("Sum : "+sum);
    }
}
