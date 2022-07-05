import java.util.Scanner;

public class MaxInArr {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size should not exceed 20");
            }
        }
        while (size > 20);
        {
            arr = new int[size];
            for (int i = 0; i < arr.length; i++) {
                System.out.print("Enter element " + (i + 1) + " : ");
                arr[i] = scanner.nextInt();
            }
        }
        System.out.print("Property list: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        FindMax(arr);
    }

    public static void FindMax(int[] arr) {
        int max = arr[0];
        int index = 1;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > max) {
                max = arr[j];
                index = j + 1;
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
}
