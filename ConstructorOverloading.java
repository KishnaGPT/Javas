package java;


public class ConstructorOverloading {
    
    int a, b, sum;
    double add;
    double a1;

    ConstructorOverloading(int a){
        this.a = a;

        System.out.println("Number is: "+a);
    }

    ConstructorOverloading(int a, int b){
        this.a = a;
        this.b = b;
        sum = a+b;
        System.out.println("Sum is: "+sum);
    }

    ConstructorOverloading(double a1, int b){
        this.a1 = a1;
        this.b = b;
        add = a1+b;
        System.out.println("Sum is: "+add);
    }

        public static void main(String[] args) {

        ConstructorOverloading c1 = new ConstructorOverloading(10);
        ConstructorOverloading c2 = new ConstructorOverloading(10,20);
        ConstructorOverloading c3 = new ConstructorOverloading(20.23,20);
        
    }


}

