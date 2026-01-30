package java;
public class SingleInheritance{

    public static void main(String[] args){

        Child c1 = new Child();
        c1.display();
        c1.display2();
    }
}

class Parent{
    int x=10;
    void display(){
        System.out.println("Inside Parent Class");
    }
}

class Child extends Parent{

    void display2(){
        System.out.println("Inside Child Class");
        System.out.println("Value of x: "+x);
    }
}