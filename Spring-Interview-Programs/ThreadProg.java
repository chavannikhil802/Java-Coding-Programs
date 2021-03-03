class Test implements Runnable {

    static int count = 0;
    @Override
    public void run() {
        count++;
        System.out.println(count+" : go");
    }
}

class ThreadProg  {
    public static void main(String[] args) {
        Thread t = new Thread(new Test());
        t.run();
        t.run();
        t.start();
    }
}

/* OUTPUT:-

1 : go
2 : go
3 : go

*/