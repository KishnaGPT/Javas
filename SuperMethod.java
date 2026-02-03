package java;
public class SuperMethod {
    
    public static void main(String[] args){
        Child1 c1 = new Child1();
        c1.show();
        
    } 
}

class Parent1{
    int x=10;
    void show(){
        System.out.println("Parent Class");
    }
}

class Child1 extends Parent1{
    int x=100;

    void show(){
        System.out.println("Value of x: "+super.x); //parent class variable
        System.out.println("Value of x: "+x); //current class variable

        super.show();

    }
}
