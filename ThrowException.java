package Javas;

import java.util.Scanner;

public class ThrowException {
    

    //     public static void main(String[] args){

    //     Scanner sc = new Scanner(System.in);

    //     System.out.println("Enter Withdraval Amount: ");
    //     double withdraw=sc.nextInt();

    //     double balance=5000;

    //     if(withdraw>balance){
    //         throw new IllegalArgumentException("Insufficient Balance! Current Balance = "+balance);
    //     }

    //     balance -= withdraw;
    //     System.out.println("Current Balance: "+balance);
    // }




    public static void main(String[] args) throws UserDefinedException{

        bal();
    }

    static void bal() throws UserDefinedException{


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Withdraval Amount: ");
        double withdraw=sc.nextInt();

        double balance=5000;

        if(withdraw>balance){
            throw new UserDefinedException("Insufficient Balance! Current Balance = "+balance);
        }

        balance -= withdraw;
        System.out.println("Current Balance: "+balance);
    

        
    }
}
