package java;

public class Prime {
    
    public static void main(String[] args){

        int num = 6;
        boolean isPrime = true;

        if(num<=1){
            System.out.println("Not Prime");
        }

        for(int i=2; i<Math.sqrt(num); i++){
            
            if(num%i==0){
                isPrime = false;
                break;
            }
        }

        if(isPrime){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not Prime Number");
        }
    }
}
