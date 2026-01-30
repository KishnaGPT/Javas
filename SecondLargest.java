package java;
public class SecondLargest {
    

    public static void main(String[] args){

        int [] y = {10, 2, 35, 3, 60};

        int first_max = y[0];
        int second_max = y[0];

        for(int i=0; i<y.length; i++){
            if(y[i]>first_max){
                second_max=first_max;
                first_max=y[i];
            }

            // useful when array have duplicates numbers
            
            else if(y[i]>second_max && y[i]!=first_max){
                second_max=y[i];
            }
        }

        System.out.println("First Highest: "+first_max);
        System.out.println("Second Highest: "+second_max);

    }
}
