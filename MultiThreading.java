public class MultiThreading {

    public static void main(String[] args) {
        
        CurrentThread t1 = new CurrentThread();
        CurrentThread t2 = new CurrentThread();

        t1.start();
        t1.setName("The Captain America");
        t2.start();
        
        for(int i=1; i<=5; i++){
            System.out.println("Main Thread"+i);
        }

        System.out.println("Inside main() method: "+Thread.currentThread().getName());

        Thread.currentThread().setName("Avenger Thread");

        System.out.println("Inside main() method After: "+Thread.currentThread().getName());
    }
}

class CurrentThread extends Thread{
    
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Child Thread: "+i);
        }
        System.out.println("Inside run() method: "+Thread.currentThread().getName());
    }   
}
