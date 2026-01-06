package java;
import java.util.Scanner;

public class MyArray{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Length Of Array: ");
        int n = sc.nextInt();
        int []arr = new int[n];

        for(int i=0;i<arr.length;i++){

            System.out.println("Enter Element at "+i+" index: ");
            arr[i]=sc.nextInt();
        }
        System.out.println();
        System.out.println("Elements of Array: ");

        for(int i=0;i<arr.length;i++){
            System.out.println("Element at index "+i+" is: "+arr[i]);
        }



    }
}