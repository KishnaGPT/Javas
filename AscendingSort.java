package java;
public class AscendingSort {
    
    public static void main(String[] args){

        int [] arr = {10,90,100,50,40,30,90};

        sortArray(arr);

        System.out.println("Sorted Array in Ascending Order is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }

    public static void sortArray(int [] arr) 
    {
        int n = arr.length;

        for(int i=0; i<n-1; i++){

            for(int j=0; j<n-i-1; j++){

                if(arr[j]>arr[j+1]){

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }
}
