package java;
import java.util.Scanner;
public class Factorial2 {
    
    Scanner sc = new Scanner(System.in);
    int num, fact=1;
    System.out.println("Enter Number: ");
    num = sc.nextInt();

    int doFact(){

        if(num>0){
            for(int i=num;i>0;i--){
                fact=fact*i;
            }
        }
        return fact;
    }

    public static void main(String[] args){

        int result = doFact();

        System.out.println("Factorial is: "+result);

        
    }
}
