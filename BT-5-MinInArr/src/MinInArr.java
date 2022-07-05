import java.util.Scanner;

public class MinInArr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        int[] arr;
        do {
            System.out.print("Enter a size: ");
            size = input.nextInt();
            if (size>20){
                System.out.println("size should not exceed 20");
            }
        }
        while (size>20);
        {
        arr = new int[size];
            for (int i = 0; i < arr.length; i++) {
                System.out.print("Enter element "+(i+1)+ " : ");
                arr[i]  = input.nextInt();
            }
        }
        findMin(arr);
    }
    public static void findMin(int[] arr){
        int min = arr[0];
        int index = 1;
        for (int i = 0; i < arr.length; i++) {
            if (min>arr[i]){
                min = arr[i];
                index = i+1;
            }
        }
        System.out.println("Min in the array is "+min+" ,at position "+index);
    }
}
