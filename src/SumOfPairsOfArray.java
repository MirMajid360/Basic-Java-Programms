import java.util.Scanner;

public class SumOfPairsOfArray {

    /**
     * Program to  get the pair from an array whose sum is equal to a particular value
     **/
    public static int size;

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int arr[];
        System.out.println("Enter Size of Array");

        size = sc.nextInt();

        arr = new int[size];

        System.out.println("Enter Elements of Array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter no, to check any pair of array elements have sum equal to this element");

        int key = sc.nextInt();

        findSmallestAndLargest(arr, key);

    }

    private static void findSmallestAndLargest(int[] arr, int key) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tempSum = arr[i] + arr[j];

                if (tempSum == key) {
                    System.out.println("Pair whose sum is equal to Entered Element are " + arr[i] + " " + arr[j]);
                    return;

                }

            }

        }
        System.out.print("No such pair Found");
    }
}
