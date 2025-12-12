public class digitAddition {
    
    public static void main(String[] args){

        int num = 1234;
        int rev=0;
        int sum=0;

        while(num>0){

            int rem = num%10;
            rev = rev*10+rem;
            num = num/10;
        }

        System.out.print("Reverse: "+rev);

        int num2 = 1234;

        while(num2>0){
            int rem = num2%10;
            sum = sum+rem;
            num2 = num2/10;
        }

        System.out.print("Sum of digit: "+sum);

    }
}
