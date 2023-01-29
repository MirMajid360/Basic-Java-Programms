import java.util.Scanner;

public class SmallestLargestElementFromArray {

    /**Program to Print Smallest and Largest Element from Array **/
    public static   int size;
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
                int arr[] ;
        System.out.println("Enter Size of Array");

        size = sc.nextInt();

        arr = new int[size];

        System.out.println("Enter Elements of Array");
        for(int i=0;i<size;i++){
             arr[i] = sc.nextInt();
        }


        findSmallestAndLargest(arr);

    }

    private static void findSmallestAndLargest(int[] arr) {

        int smallest = arr[0];
        int largest   =arr[0];

        for (int i=1;i< size;i++){
             if (arr[i]<smallest){
                 smallest = arr[i];
             } else if (arr[i]>largest) {
                 largest= arr[i];
             }
        }
        System.out.println("Smallest no : "+smallest+"\nLargest no :"+largest);
    }
}
