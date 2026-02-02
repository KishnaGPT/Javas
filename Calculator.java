import java.util.Scanner;

class Calculator{

    static void add(int a, int b){
        int result = a+b;
        System.out.println("Addition is: "+result);
    }

    static void sub(int a, int b){
        int result = a-b;
        System.out.println("Subtraction is: "+result);
    }

    static void mul(int a, int b){
        int result = a*b;
        System.out.println("Multiplication is: "+result);
    }

    static void div(int a, int b){
        int result = a/b;
        System.out.println("Division is: "+result);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter First Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int num2= sc.nextInt();

        add(num1,num2);
        sub(num1, num2);
        mul(num1, num2);
        div(num1, num2);
    }
}


