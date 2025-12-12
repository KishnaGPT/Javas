package java;
public class HierachicalInheritance {

    public static void main(String [] args){

        Son s1 = new Son();
        s1.display();
        s1.display2();

        Daughter d1 = new Daughter();
        s1.display();
        d1.display3();

    }
}

class Super{
    int x=10;
    void display(){
        System.out.println("Inside Parent Class");
    }
}

class Son extends Super{

    void display2(){
        System.out.println("Inside Son Class "+x);
    }
}

class Daughter extends Super{

    void display3(){
        System.out.println("Inside Daughter Class "+x);
    }
}
