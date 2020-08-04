import java.util.Scanner;

// Class with the Logic to Print the Progress Status
class ProgressBar {
    char[] animationChars = new char[] { '|', '/', '-', '\\' };
    String arrow = "=";
    int i = 0;

    // Synchronized Method to print the Progress Status
    synchronized public void printProgress(String threadName) {
        System.out.print("\nProcessing "+threadName+":-\n");
        for (i=0;i<=50;i++) {
            arrow = arrow + "=";
            if (i < 50) {
                System.out.print("Processing "+i*2 + "% " + animationChars[i % 4] + " " + arrow + ">" + "\r");
            } else
                System.out.print(i*2 + "% " + arrow + "=>" + " Processing "+threadName+" Completed.\n\n");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        arrow = "=";
    }
}

// Thread Class
class ConsoleProgressBarThread extends Thread {
    // Object of ProgressBar
    ProgressBar progress;

    ConsoleProgressBarThread() {}

    ConsoleProgressBarThread(ProgressBar progress) {
        this.progress = progress;
    }

    public void run() {
        progress.printProgress(this.getName());
    }
}

class ConsoleProgressBar {
    public static void main(String[] args) {
        // OBJECT OF CLASS OF MAIN LOGIC
        ProgressBar bar = new ProgressBar();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of threads: ");
        int number = input.nextInt();
        for(int i=0;i<number;i++) {
            // OBJECT OF THREAD CLASS
            // PASSING PROGRESSBAR OBJECT AS A PARAMETER TO THE CLASS
            ConsoleProgressBarThread thread = new ConsoleProgressBarThread(bar);
            thread.start();
        }
        input.close();
    }
}