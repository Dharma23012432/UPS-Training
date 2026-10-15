class Main{
    public static void main(String[] args){
        Object lock = new Object();
        Thread t1 = new Thread(()->{
            synchronized(lock){
                System.out.println("Thread 1 is running");
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                System.out.println("Thread 1 is resumed");
            }
        });
        t1.start();
        Thread t2 = new Thread(()->{
            synchronized(lock){
                System.out.println("Thread 2 is running");
                lock.notify();
                System.out.println("Thread 2 has notified");
            }
        });
        t2.start();
    }
}