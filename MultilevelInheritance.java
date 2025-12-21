package java;
public class MultilevelInheritance {
 
    public static void main(String[] args){

        Apple gc = new Apple();
        gc.display();
        gc.display2();
        gc.display3();
    }
}

class Fruit{
    int x=10;
    void display(){
        System.out.println("Inside Parent Class");
    }
}

class Mango extends Fruit{
    int y = 20;
    void display2(){
        System.out.println("Inside Child Class");
        System.out.println("Value of x: "+x);
    }
}

class Apple extends Mango{

    void display3(){
        System.out.println("Inside GrandChild Class");
        System.out.println("Value of Y: "+y);
    }
}
