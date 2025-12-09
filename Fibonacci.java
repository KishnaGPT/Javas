package java;
import java.util.Scanner;
public class Fibonacci {

    public static void main(String[] args){
        
        Calculate c1 = new Calculate();
        c1.fibo();
    }
   
}

class Calculate{
 
    Scanner sc = new Scanner(System.in);
    int num;
    int num1 = 0;
    int num2=1;

    
    void fibo(){

        System.out.println("Enter Range of Fibonacci Series: ");
        num = sc.nextInt();

            System.out.println("Fibonacci Series till "+num+" is: ");

            if(num==1){
                System.out.println(num1);
            }
            if(num==2){
                System.out.println(num1);
                System.out.println(num2);
            }
            if(num>2){
                System.out.println(num1);
                System.out.println(num2);

                for(int i = 3; i<=num; i++){
                    int next = num1+num2;
                    System.out.println(next);
                    num1=num2;
                    num2=next;
                }
            }            
        }
    }
