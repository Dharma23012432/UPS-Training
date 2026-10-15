class ATM{
     synchronized void withdraw(int amount){
        System.out.println("Going to withdraw...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        if(amount>1000){
            System.out.println("Less balance; waiting for deposit...");
            try{
                wait();
            }catch(Exception e){}
        }
        System.out.println("Withdraw completed...");
    }
}
 
class Main {
 
    public static void main(String[] args) {
        ATM atm = new ATM();
        Thread th1 = new Thread(new Runnable() {
            public void run() {
                atm.withdraw(1500);
            }
        });
         Thread th2 = new Thread(new Runnable() {
            public void run() {
                atm.withdraw(800);
            }
        });
     
        th1.start();
        th2.start();
    }
}