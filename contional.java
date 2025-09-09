package Java;

class contional{

    public static void main(String[] args){

        int num = 5;
        if(num%2==0){
            System.out.println("EVEN");
        }
        else{
            System.out.println("ODD");
        }


        int num2 = 10;
        if(num2%3==0 && num2%5!=0){
            System.out.println("Your number is correct");
        }
        else{
            System.out.println("Choose another number");
        }
    }
}

