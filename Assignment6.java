
import java.util.Scanner;

public class Assignment6{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your sorting routine\n1)Insertion Sort\n2)Shell Sort\n3)Merge Sort\n4)Quick Sort");
        //insert sorting routine choosing algorithm
        int sortInput = input.nextInt();


        System.out.println("Please enter the number of integers in your array.");
        //insert a variable that becomes the size of an array 
        int arraysize = input.nextInt(); 
        int[] MyArray = new int[arraysize];
        System.out.println("Enter the numbers in your array");
        for(int i=0; i < arraysize; i++){
            MyArray[i] = input.nextInt();
        }

        //prints array before sort
        System.out.println("here's your array");
        printArray(MyArray);
        
        switch(sortInput){
            case 1: 
                System.out.println("Insertion Sort");
                break;
            case 2:
                System.out.println("Shell Sort");
                break;
            case 3:
                System.out.println("Merge Sort");
                break;
            case 4:
                System.out.println("Quick Sort");
                break;


            
        }



        
        //loop number of times for size of array
    
    }
    //array printing function
    public static void printArray(int[] arr){
        System.out.print("[");
        for(int i=0; i<arr.length; i++)
            if (i != arr.length-1)
                System.out.print(arr[i]+",");
            else
                System.out.print(arr[i]);
        System.out.println("]");
            
    }
    public class sortingAlgos {
        /* Function to sort array using insertion sort */
        void insertionSort(int arr[])
        {
            int n = arr.length;
            for (int i = 1; i < n; ++i) {
                int key = arr[i];
                int j = i - 1;
    
                /* Move elements of arr[0..i-1], that are
                   greater than key, to one position ahead
                   of their current position */
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
                arr[j + 1] = key;
            }
        }
    }
    
        
}
