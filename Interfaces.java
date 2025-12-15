package java;
public class Interfaces{
    
    public static void main(String[] args){

        Cls1 s1 = new Cls1();
        s1.show();
        s1.display();

    }
}

interface Inter1{

    int x=10;
    void display();
    void show();
}

interface Inter2{

    int y=20;
}

class Cls1 implements Inter1, Inter2{

    int a=100;

    public void show(){
        System.out.println("Value of X: "+Inter1.x);
        System.out.println("Value of X: "+Inter2.y);
    }

    public void display(){
        System.out.println("Value of a: "+a);
    }

}
