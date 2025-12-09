package Javas;

public class ExceptionHandling {
    
    public static void main(String[] args){

        try{

            int [] x = new int[5];
            x[3] = 10;

            System.out.println(x[3]);
            x[13] = 100;
            System.out.println(x[13]);

            String s = "Hello";
            System.out.println(s.length());

            int r = 10/0;
            System.out.println("R is: "+r);
        }
        catch(ArithmeticException e){
            System.out.println("Not divisible by 0");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Out of Index");
        }
        catch(NullPointerException e){
            System.out.println("Not an Array");
        }
        catch(Exception e){
            System.out.println("Not an Array");
        }
        System.out.println("hello");
    }
}
