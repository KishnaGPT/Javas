public class ThreadThreading {
    
    public static void main(String[] args){
        Axis a = new Axis();
        a.start();
        a.run(10);

        for(int i=0; i<4; i++){
            System.out.println("Bank Threading");
        }
    }
}


public class Axis extends Thread{

    public void run(){
        for(int i=0; i<4; i++){
            System.out.println("Sbi Threading: "+i);
        }
    }

    public void run(int i){
        System.out.println("Sbi Threading "+i);
    }
}
