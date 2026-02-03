package java;
public class SuperConstructor {
    
    public static void main(String[] args){

        Child2 c1 =new Child2();
    }
}

class Parent2{

    Parent2(){
        System.out.println("Parent Class");
    }
}

class Child2 extends Parent2{

    Child2(){
        System.out.println("Child Class");
    }
}
