package java;

public class Leap {
    
    public static void main(String[] args){

        int year = 2024;

        // if(year%4==0){
        //     if(year%100!=0){
        //         System.out.println(year+" is Leap Year");
        //     }
        //     else{
        //         if(year%400==0){
        //             System.out.println(year+" is Leap Year");
        //         }
        //         else{
        //             System.out.println(year+" is not Leap Year");
        //         }
                
        //     }
        // }
        // else{
        //     System.out.println(year+" is not Leap Year");
        // }

        // if(year%4==0 && year%100!=0){
        //     System.out.println(year+" is Leap Year");
        // }
        // else{
        //     if(year%400==0){
        //         System.out.println(year+" is Leap Year");
        //     }
        //     else{
        //         System.out.println(year+" is not Leap Year");
        //     }
        // }


        if(year%4==0 && year%100!=0 || year%400==0){
            System.out.println(year+" is Leap Year");
        }
        else{
            System.out.println(year+" is not Leap Year");
        }
    }
}
