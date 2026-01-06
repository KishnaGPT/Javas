package java;
public class MyArray2 {
    
    public static void main(String[] args) {

        int[] num = {100, 200, 300, 400};
        String[] str = {"Apple","Mango","Grapes"};
        Boolean[] bool = {true, false, true, false};
        double[] db = {10.31, 11.32, 17.1, 18.0};
        Object[] obj = {100, "Apple",true,10.31};
        float[] ft = {10.31f, 11.32f, 17.1f, 18.0f};

        System.out.println("Pinting Integers");

        for(int i:num){
            System.out.println(i);
        }

        System.out.println("Pinting Strings");

        for(String i: str){
            System.out.println(i);
        }

        System.out.println("Printing Booleans");

        for(Boolean i: bool){
            System.out.println(i);
        }

        System.out.println("Printing Doubles");

        for(double i: db){
            System.out.println(i);
        }

        System.out.println("Printing Objects");

        for(Object i: obj){
            System.out.println(i);
        }

        System.out.println("Printing Floats");

        for(float i: ft){
            System.out.println(i);
        }
    }
} 

