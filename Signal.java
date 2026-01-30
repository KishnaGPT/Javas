package java;

public class Signal {
    
    public static void main(String[] args){

        String color = "Green";

        if(color=="Red"){
            System.out.println("Stop X");
        }
        else if(color=="Yellow"){
            System.out.println("Slow Down");
        }
        else if(color=="Green"){
            System.out.println("Good To Go");
        }
    }
}
