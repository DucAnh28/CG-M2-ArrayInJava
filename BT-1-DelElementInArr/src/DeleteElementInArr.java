import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementInArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 5, 6, 7, 8, 9};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number want to delete");
        int num = scanner.nextInt();
        int index_del = 0;
        for (int i = 0; i < arr.length; i++, index_del++) {
            if (num == arr[i]) {
                System.out.println("Number you want to delete in index " + index_del);
                int j = i;
                while (j < arr.length-1) {
                    arr[j] = arr[j + 1];
                    arr[j + 1] = 0;
                    j++;
                }
                i--;
            }
        }
        for (int element : arr) {
            System.out.print(element + "\t");
        }
    }
}
