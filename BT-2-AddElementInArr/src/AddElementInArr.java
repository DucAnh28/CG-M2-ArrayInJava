import java.util.Scanner;

public class AddElementInArr {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 0, 6, 8, 0, 0};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number want to add: ");
        int num = scanner.nextInt();
        System.out.print("Enter your index want to add: ");
        int index_add = scanner.nextInt();
        if (index_add<=-1 || index_add>= array.length-1){
            System.out.println("Can't add element in arr");
        }
        for (int i = 0; i < array.length; i++) {
            if (i == index_add) {
                for (int j = 0; j < array.length-index_add; j++) {
                    array[array.length-j-1] = array[array.length-j-2];
                }
                array[index_add] = num;
            }
        }
        for (int element : array){
            System.out.print(element+"\t");
        }
    }
}
