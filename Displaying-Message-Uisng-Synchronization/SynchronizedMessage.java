// PROGRAM TO DEMONSTRATE THE USE OF SYNCHRONIZATION IN MULTITHREADING

// CLASS THAT CONTAINS THE LOGIC TO DISPLAY THE MESSAGE
class DisplaySynchronizedMessage {
    
    // SYNCHRONIZED METHOD TO DISPLAY THE MESSAGE
    // WITHOUT THE USE OD synchronized, THE EXECUTION WILL NOT BE AS DESIRED
    synchronized void displayMessage(String message) {
        // LOGIC TO PRINT THE MESSAGE WORD BY WORD
        for(int i=0;i<message.length();i++) {
            System.out.print(message.charAt(i));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Thread Interrupted");
            }
        }
        System.out.println();
    }
}

// THREAD CLASS WHICH WILL BE USED TO ACCESS THE 
// OBJECT OF DisplayMesssage CLASS
class DisplaySynchronizedMessageThread extends Thread {
    String msg;
    DisplaySynchronizedMessage displayMessage;
    Thread t;

    // PARAMETERIZED CONSTRUCTOR
    DisplaySynchronizedMessageThread(DisplaySynchronizedMessage dm, String m) {
        msg = m;
        displayMessage = dm;
        // CREATING A NEW THREAD
        t = new Thread(this);
        // STARTING THE THREAD
        t.start();
    }

    public void run() {
        // CALLING THE METHOD TO DISPLAY THE MESSAGE
        displayMessage.displayMessage(msg);
    }

    // WE CAN ALSO USE A SYNCHRONIZED BLOCK USING THE OBJECT OF DisplayMessageThread CLASS

    // FOLLOWING IS THE CODE
    // public void run() {
    //     synchronized(displayMessage) {
    //         displayMessage.displayMessage(msg);
    //     }
    // }
}

// MAIN CLASS
class SynchronizedMessage {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("DISPLAY THREAD MESSAGES WITH SYNCHRONIZATION:-\n");
        // CREATING THE OBECT OF DisplayMessage CLASS
        DisplaySynchronizedMessage d_Message = new DisplaySynchronizedMessage();
        // CREATING 3OBJECTS OF DisplayMessageThread AND PASSING THE OBJECT OF DisplayMessage CLASS  AS PARAMETERS to it.
        DisplaySynchronizedMessageThread d_m_Thread_1 = new DisplaySynchronizedMessageThread(d_Message, "Message from Thread 1");
        DisplaySynchronizedMessageThread d_m_Thread_2 = new DisplaySynchronizedMessageThread(d_Message, "Message from Thread 2");
        DisplaySynchronizedMessageThread d_m_Thread_3 = new DisplaySynchronizedMessageThread(d_Message, "Message from Thread 3");

        try {
            // WAITING FOR THE THREADS TO FINISH THEIR EXECUTION
            d_m_Thread_1.t.join();
            d_m_Thread_2.t.join();
            d_m_Thread_3.t.join();
        }
        catch (InterruptedException e) {
            System.out.println("Exeption in Main Class");
        }
        System.out.println();
    }
}