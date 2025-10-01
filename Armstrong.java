package java;

public class Armstrong {

    public static void main(String [] args){

        int num = 371;

        int og_num = num;
        double sum=0;

        while(num>0){

            int digit = num%10;
            sum= sum + Math.pow(digit,3);
            num=num/10;
        }

        System.out.println(sum);

        if(og_num==sum){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
        
        
    }
    
}
