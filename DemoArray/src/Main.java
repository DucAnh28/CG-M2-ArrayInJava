public class Main {
    public static void main(String[] args) {
        //khởi tạo 1 mảng số nguyên có 10 phần tử sử dụng từ khóa new
        int arr1[] = new int[10];
        int[] arr2 = new int[10];
        char[] chars = new char[10];
        boolean[] booleans = new boolean[10];

        for (int i : chars) {
            System.out.println(i);
        }
////        ép giá trị qua lại giữa char và int
//        char a = 'b';
//        int b = 98;
//        System.out.println(b);
//        System.out.println((char) b);

        //thay đổi giá trị 1 phần tử bất kỳ
        arr2[2] = 100;
//        arr2[10] = 100;

        //khởi tạo 1 mảng số nguyên sử dụng literal
        int[] arr3 = {1, 2, 3};

        //khởi tạo
        int[] arr4 = new int[]{1, 2, 3};

        //khởi tạo mảng 2 chiều
        int array1[][] = new int[5][5];
        array1[2][2] = 100;

        int[][] array2 = new int[5][5];
        int[] array3[] = new int[5][5];

        int[][] array4 = new int[5][];
//        int [][] array5 = new int[][5]; => lỗi
        int[][] array6 = {{1, 2}, {3, 4}};
        int[][] array7 = new int[][]{{1, 2}, {3, 4}};

        //duyệt mảng 2 chiều sử dụng for basic
        for (int i = 0; i < array7.length; i++) {
            for (int j = 0; j < array7[i].length; j++) {
                System.out.println(array7[i][j]);
            }
        }

        //duyệt mảng 2 chiều sử dụng for nâng cao (enhance for)
        for (int element : arr1) {
            System.out.println(element);
        }

        for (int[] element : array7) {
            for (int e : element) {
                System.out.println(e);
            }
        }
    }
}
