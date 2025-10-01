package java;
public class ArrayExample {
    
    public static void main(String[] args) {
        
        int [] x = {10,20,3,4,60,5,7,9};
        int even=0;
        int odd=0;

        for(int i = 0; i<x.length; i++){

            if(x[i]%2==0){
                even+=1;
            }
            else{
                odd+=1;
            }
        }

        System.out.println("Total Even Numbers: "+even);
        System.out.println("Total Odd Numbers: "+odd);


        System.out.println();

        int max = 0;

        for(int i=0; i<x.length; i++){
            if(x[i]>max){
                max=x[i];
            }
        }

        System.out.println("Maximum Number in Array: "+max);
        

        System.out.println();

        int min=0;
        
        for(int i=0; i<x.length; i++){

            if(x[i]>max){
                max=x[i];
                min=max;
            }
            else if(x[i]>min && x[i]!=max){
                min=x[i];
            }
        }

        System.out.println("First Largest: "+max);
        System.out.println("Second Largest: "+min);

        


        System.out.println();

        int [] reverse = new int[x.length];

        int count=0;

        for(int i=x.length-1; i>=0; i--){
            
                reverse[count]=x[i];
                count++;

        }
        System.out.println("Reverse Array");

        for(int i=0;i<reverse.length;i++){

            System.out.print(reverse[i]+" ");
        }

        
    }
}

