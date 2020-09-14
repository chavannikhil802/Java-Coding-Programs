public class While {
    public static void main(String[] args) {
        int count = 0;
        while (count!=10) {
            System.out.println("Count is "+count);
            count++;
        }
        System.out.println();

        count = 1;
        while(true) {
            if(count == 10) {
                break;
            }
            System.out.println("Count is "+count);
            count++;
        }
    }
}
