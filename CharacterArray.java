package Javas;

import java.util.Scanner;

public class CharacterArray {
    
    public static void main(String[] args){

        char [] arr = {'H','E','L','L','O'};

        char[][] x = {{'a','b','c'},{'d','e','j'},{'k','l','m'}};

        for(int i=0; i<arr.length; i++)
        {
            System.out.println("Character at index "+i+" is : "+arr[i]);
        }

        for(int i=0;i<x.length;i++)
        {
            for(int j=0;j<x[0].length;j++)
            {
                System.out.print(x[i][j]+" ");
            }
            System.out.println();
        }


        Scanner sc = new Scanner(System.in);
        char[][] a = new char[2][2];

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                System.out.println("Enter value: ");
                a[i][j] = sc.next().charAt(0);
            }
        }

        System.out.println("Values Are: ");
        
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
