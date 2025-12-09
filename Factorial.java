package java;
import java.util.Scanner;

class Calculation{

    Scanner sc = new Scanner(System.in);
    int num;
    int fact=1;

    void doFact(){

        System.out.println("Enter Number: ");
        num = sc.nextInt();

        if(num>1){

            for(int i=num;i>0;i--){
                 fact=fact*i;
            }
        }

        System.out.println("Factorial of "+num+" is: "+fact);
    }
}
public class Factorial {

    public static void main(String[] args){

        Calculation c1 = new Calculation();
        c1.doFact();
    }
    
}
