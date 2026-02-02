package java;

public class StaticMethod {
    
    public static void main(String[] args){
        display();

    }
    static void display(){

        System.out.println("Inside Static Method");
        StaticMethod m1 = new StaticMethod();
        m1.display2();
    }
    void display2(){
        System.out.println("Inside Instance Method");
    }
}
