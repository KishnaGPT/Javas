package java;
import java.util.Scanner;

public class Userinput {

    public static void main(String[] args){
    
        String name;
        int age;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Name: ");
        name = sc.nextLine();

        System.out.println("Enter Age: ");
        age = sc.nextInt();

        // if we take string input later than it will not allow us to give string input

        // System.out.println("Enter Age: ");
        // age = sc.nextInt();

        // System.out.println("Enter Name: ");
        // name = sc.nextLine();

        System.out.println("Name: "+name);
        System.out.println("Age: "+age);

    }
}
