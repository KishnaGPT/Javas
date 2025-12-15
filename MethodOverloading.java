package java;

public class MethodOverloading {
    
    public static void main(String[] args) {

        MethodOverloading op = new MethodOverloading();
        op.add(10);
        op.add(10,20);
        op.add(10.2,20);


    }

    void add(int a){
        System.out.println("Entered Value: "+a);
    }

    void add(int a, int b){
        int sum = a+b;
        System.out.println("Sum is: "+sum);
    }

    void add(double a, int b){
        double sum = a+b;
        System.out.println("Multiplication is: "+sum);
    }
}

