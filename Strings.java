package Javas;

import java.util.Scanner;

public class Strings {
    
    public static void main(String[] args){

        String str = new String("Avenger");

        String str2 = str.concat(" Assemble");

        System.out.println(str2);


        StringBuffer sb1 = new StringBuffer("Hello");

        StringBuffer sb2 = sb1.append(" World");

        System.err.println(sb2);


        String [] s = new String[3];

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<s.length; i++){

            System.out.println("Enter Value: ");
            s[i]=sc.next();
        }

        for(int i=0; i<s.length; i++){

            System.out.println("Item at index "+i+" : "+s[i]);
        }

        String [][] mystr = new String[3][3];

        for(int i=0; i<mystr.length; i++){
            for(int j=0; j<mystr[0].length; j++){
                System.out.println("Enter Value At Index ["+i+"]["+j+"]: ");
                mystr[i][j] = sc.next();
            }
        }

         System.out.println("Values Are: ");
         System.out.println();

        for(int i=0; i<mystr.length; i++){

            for(int j=0; j<mystr[0].length; j++){
               
                
                System.out.print(mystr[i][j]+" ");
            }

            System.out.println();
        }

      


    }
}
