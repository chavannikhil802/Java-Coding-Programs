/*
Accept 3 integers using command-line arguments and find the maximum and minimum of them.
*/

class Program1 {
    public static void main(String[] args) {
        int num1, num2, num3;
        if(args.length != 3) {
            System.out.println("Invalid Arguments!!!!");
        }
        else {
            num1 = Integer.parseInt(args[0]);
            num2 = Integer.parseInt(args[1]);
            num3 = Integer.parseInt(args[2]);

            if(num1 > num2 && num1 > num2) {
                System.out.println(num1+" is the Maximum Number");

                if(num2 < num3) {
                    System.out.println(num2+" is the Minimum Number");
                }
                else {
                    System.out.println(num3+" is the Minimum Number");
                }
            }
            else if(num2 > num1 && num2 > num3) {
                System.out.println(num2+" is the Maximum Number");

                if(num1 < num3) {
                    System.out.println(num1+" is the Minimum Number");
                }
                else {
                    System.out.println(num3+" is the Minimum Number");
                }
            }
            else {
                System.out.println(num3+" is the Maximum Number");

                if(num1 < num2) {
                    System.out.println(num1+" is the Minimum Number");
                }
                else {
                    System.out.println(num2+" is the Minimum Number");
                }
            }
        }
    }
}

/* OUTPUT:-

PS D:\Java-Coding\Java-Programs\Assignment-2\Set-A-additional> java Program1 333 222 111
333 is the Maximum Number
111 is the Minimum Number
PS D:\Java-Coding\Java-Programs\Assignment-2\Set-A-additional> java Program1 111 333 222
333 is the Maximum Number
111 is the Minimum Number
PS D:\Java-Coding\Java-Programs\Assignment-2\Set-A-additional> java Program1 111 222 333
333 is the Maximum Number
111 is the Minimum Number

*/
