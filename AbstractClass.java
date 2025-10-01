package java;

abstract class Animals{

    abstract void sound();

    void show(){
        System.out.println("Inside Animal Class");
    }
}

class Dog extends Animals{

    void sound(){
        System.out.println("Dog Bark");
    }
}

class Cat extends Animals{

    void sound(){
        System.out.println("Cat Meow");
    }
}

public class AbstractClass {

    public static void main(String[] args){

        Dog d1 = new Dog();
        d1.show();
        d1.sound();
        Cat c1 = new Cat();
        c1.sound();
    }
    
}


