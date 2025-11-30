
public class ConstructorOverridingParamenter {
    
    public static void main(String[] args){
        Child3 c2 = new Child3();
        Child3 c1 = new Child3(500);
    }
}

class Parent3{

    Parent3(int x, String s){
        System.out.println("Integer in Parent is: "+x);
        System.out.println("String is: "+s);

    }
}

class Child3 extends Parent3{

    Child3(int y){

        super(10,"Hello");
        System.out.println("Integer in Child Y is: "+y);
    }

    Child3(){
        super(20, "Bye");
        System.out.println("Unparameterized Constructor");
    }
}

// jitne bhi child class ke constructor honge un sabme parent class ke constructor ko call karna hoga.