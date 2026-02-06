package java;
import java.util.Scanner;


//different class
class Model{

    static int year = 2025; //static variable
    String color, name; //instance variables

    void get(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Model Color: ");
        color=sc.nextLine();
        System.out.println("Enter Model Name: ");
        name=sc.nextLine();

    }
    void display(){
        System.out.println("Vehicle Name: "+name);
        System.out.println("Vehicle Color: "+color);
        System.out.println("Lanched Year: "+year);
    }

}


public class Vehicle {

    
    public static void main(String[] args){

        Model m1 = new Model();
        Model m2 = new Model();
        m1.get();
        m2.get();
        m1.display();
        Model.year=2026;
        m2.display();
        

    }
}
