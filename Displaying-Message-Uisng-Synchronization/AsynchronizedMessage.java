// PROGRAM TO DEMONSTRATE THE NEED OF SYNCHRONIZATION IN MULTITHREADING

// CLASS THAT CONTAINS THE LOGIC TO DISPLAY THE MESSAGE
class DisplayAsynchronizedMessage {
    
    // METHOD TO DISPLAY THE MESSAGE

    void displayMessage(String message) {
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
class DisplayAsynchronizedMessageThread extends Thread {
    String msg;
    DisplayAsynchronizedMessage displayMessage;
    Thread t;

    // PARAMETERIZED CONSTRUCTOR
    DisplayAsynchronizedMessageThread(DisplayAsynchronizedMessage dm, String m) {
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
}

// MAIN CLASS
class AsynchronizedMessage {
    public static void main(String[] args) {
        System.out.println();
        // CREATING THE OBECT OF DisplayMessage CLASS
        System.out.println("DISPLAY THREAD MESSAGES WITHOUT SYNCHRONIZATION:-\n");
        DisplayAsynchronizedMessage d_Message = new DisplayAsynchronizedMessage();
        // CREATING 3OBJECTS OF DisplayMessageThread AND PASSING THE OBJECT OF DisplayMessage CLASS  AS PARAMETERS to it.
        DisplayAsynchronizedMessageThread d_m_Thread_1 = new DisplayAsynchronizedMessageThread(d_Message, "Message from Thread 1");
        DisplayAsynchronizedMessageThread d_m_Thread_2 = new DisplayAsynchronizedMessageThread(d_Message, "Message from Thread 2");
        DisplayAsynchronizedMessageThread d_m_Thread_3 = new DisplayAsynchronizedMessageThread(d_Message, "Message from Thread 3");

        try {
            // WAITING FOR THE THREADS TO FINISH THEIR EXECUTION
            d_m_Thread_1.t.join();
            d_m_Thread_2.t.join();
            d_m_Thread_3.t.join();
        }
        catch (InterruptedException e) {
            System.out.println("Exeption in Main Class");
        }
    }
}