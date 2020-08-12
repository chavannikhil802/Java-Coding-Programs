// PROGRAM TO DISPLAY THE CURRENT TIME IN cOMMAND LINE

import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;

class DisplayConsoleTimeThread extends Thread {

    private volatile boolean stop = false;

    public void run() {
        while(stop == false) {  
            DateFormat  dtf = new SimpleDateFormat("hh.mm.ss aa");  
            System.out.print("  Current Time : "+dtf.format(new Date()).toString()+"\r");
            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException e) {
                System.out.println("Error");
            }
        }
    }

    public void stopTime() {
        stop = true;
    }
}

public class DisplayConsoleTime {    
    public static void main(String[] args) {  
        
        DisplayConsoleTimeThread t = new DisplayConsoleTimeThread();
        t.start();
        
        System.out.println("\nPress Enter Key to Stop the Command Line Watch\n"); 
		 Scanner scanner = new Scanner(System.in);
		 if(scanner.nextLine() != null) {
            t.stopTime();
            System.out.println();
            scanner.close();
         }
    }    
}    