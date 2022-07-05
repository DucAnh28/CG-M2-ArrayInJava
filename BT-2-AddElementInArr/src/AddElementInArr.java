import java.util.Arrays;
import java.util.Scanner;

public class AddElementInArr {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 0, 6, 8, 0, 0};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number want to add: ");
        int num = scanner.nextInt();
        System.out.print("Enter your index want to add: ");
        int index_add = scanner.nextInt();
        int temp1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index_add) {
                for (int j = index_add+1; j < array.length-1; j++) {
                    temp1 = array[i];
                    array[i] = num;

                }
                break;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
