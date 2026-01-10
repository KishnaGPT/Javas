package java;
import java.util.Scanner;

public class MyPrime {
    int number;
    boolean isPrime;

    void prime(int num){

        number = num;
        isPrime = true;

        if(num<=1){
            System.out.println("Not Prime");
        }

        for(int i=1; i<num/2; i++){
            
            if(num%i==0){
                isPrime = false;
                break;
            }
        }

        if(isPrime){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not Prime Number");
        }
    }

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to Check if it is Prime Number: ");
        int num = sc.nextInt();
        MyPrime m1 = new MyPrime();
        m1.prime(num);


    }
}
