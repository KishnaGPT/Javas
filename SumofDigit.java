package JAVAS;

public class SumofDigit {
    
    public static void main(String [] args){

        int num = 1234;
        // int sum=0;
        int rev=0;

        while(num>0){

            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }

        System.out.println(rev);


        
        // while(num>0){

        //     int rem=num%10;
        //     sum=sum+rem;
        //     num=num/10;
        // }

        // System.out.println(sum);
    }
}
