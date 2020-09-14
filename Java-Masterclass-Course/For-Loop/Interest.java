class Interest{
    public static void main(String[] args) {

        System.out.println("Without string Formatting (ASC ORDER) :-");
        for(int i=1;i<=10;i++) {
            System.out.println("10000 at "+i+"% interest : "+calculateInterestRate(10000, i));         
        }
        System.out.println("\nWith string Formatting (ASC ORDER) :-");
        for(int i=1;i<=10;i++) {
            System.out.println("10000 at "+i+"% interest : "+String.format("%.2f",calculateInterestRate(10000, i)));            
        }
        System.out.println("\nWith string Formatting (DESC ORDER) :-");
        for(int i=10;i>=1;i--) {
            System.out.println("10000 at "+i+"% interest : "+String.format("%.2f",calculateInterestRate(10000, i)));            
        }
    }

    public static double calculateInterestRate(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }
}