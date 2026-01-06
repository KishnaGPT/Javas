package java;
import java.util.Scanner;

public class MyPalindrome {
    int number;

    void palindrome(){

        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter Number: ");

        number = sc.nextInt();

        int og_num = number;
        int res=0;

        while(number>0){
            int digit = number%10;
            res = res*10+digit;
            number= number/10;
        }

        if(og_num==res){
            System.out.println(og_num+" is Palindrome");
        }
        else{
            System.out.println(og_num+" is Not Palindrome");
        }
    }

    public static void main(String[] args){

         MyPalindrome c1 = new MyPalindrome();
         c1.palindrome();
    }
   
}
