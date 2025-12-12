package java;

public class InstanceMethod {
    
    public static void main(String[] args){

        InstanceMethod m1 = new InstanceMethod();
        m1.display();

    }

    void display(){
        System.out.println("Inside Instance Method");
        display1();
    }

    static void display1(){
        System.out.println("Inside Static Method");
    }
}
