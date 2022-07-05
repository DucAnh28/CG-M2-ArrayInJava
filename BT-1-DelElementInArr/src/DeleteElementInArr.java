import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementInArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number want to delete");
        int num = scanner.nextInt();
        int index_del = 0;
        for (int i = 0; i < arr.length; i++) {
            if (num==arr[i]){
                arr[i]=0;
                index_del = i;
            }
        }
        for (int j = index_del; j < arr.length-1; j++) {
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        }
        System.out.println(arr);
    }
}
