package Javas;

import java.io.*;

public class ThrowsException {
    
    // public static void main(String[] args){

    //     try{
    //         read();
    //         System.out.println("File Readed Sucessfully!");
    //     }
    //     catch(IOException e){
    //         System.out.println("Error is: "+e);
    //     }

    // }

    // static void read() throws IOException{

    //     FileReader f1 = new FileReader("D:\\KL209\\Javas\\File1.txt");
    // }


    public static void main(String[] args) throws IOException{
        
        read();
        System.out.println("File Readed Sucessfully!");
    }


    static void read() throws IOException{

        FileReader f1 = new FileReader("D:\\KL209\\Javas\\File1.txt");

    }

}
