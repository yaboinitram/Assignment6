
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
        
        //takes earlier input and applies sort algo
        switch(sortInput){
            case 1: 
                System.out.println("Insertion Sort");
                sortingAlgos.insertionSort(MyArray);
                break;
            case 2:
                System.out.println("Shell Sort");
                sortingAlgos.shellSort(MyArray);
                break;
            case 3:
                System.out.println("Merge Sort");
                break;
            case 4:
                System.out.println("Quick Sort");
                break;


            
        }



        
    
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
        // Insertion sort function 
        static void insertionSort(int arr[]){
            int n = arr.length;
            for (int i = 1; i < n; i++) {
                // holds current value before replacing it
                int numHolder = arr[i];
                System.out.println("now sorting " + numHolder);
                int j = i - 1;
    
                // move elements grater than numHolder one position to the right
                while (j >= 0 && arr[j] > numHolder) {
                    arr[j + 1] = arr[j];
                    j--;
                    printArray(arr);
                }
                arr[j + 1] = numHolder;
                printArray(arr);
            }
        }
        //Shell sort function
        static void shellSort(int arr[]){
            int n = arr.length;
            for (int gap = n/2; gap > 0; gap /= 2)
            {
                for (int i = gap; i < n; i ++)
                {
                    int temp = arr[i];
                    System.out.print("gap size "+ gap);
                    System.out.println("sorting "+ temp);
                    int j;
                    for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
                        arr[j] = arr[j - gap];
                    arr[j] = temp;
                    printArray(arr);
                }
            }
        }
    }
    
        
}
