public class RunnableThreading {

    public static void main(String[] args){

        Sbi s = new Sbi();
        Thread t1 = new Thread(s);
        t1.start();
        s.run(10);

        for(int i=0; i<4; i++){
            System.out.println("Bank Threading");
        }

    }
    
}

class Sbi implements Runnable{

    public void run(){

        for(int i=0; i<4;i++){
            System.out.println("SBI Threading 1");
        }
    }

    public void run(int i){
        System.out.println("SBI Threading 2: "+i);
    }
}
