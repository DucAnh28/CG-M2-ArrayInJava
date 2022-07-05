
public class MainAndMinorCrossInARR {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int cc1 = 0;
        int cp1 = 0;
//        cách 1:
        for (int i = 0; i < arr.length; i++) {
            cp1 += arr[i][i];
            cp1 += arr[i][arr.length - i - 1];
        }
        System.out.println(cc1 - cp1);
//        cách 2:
        int cc = 0;
        int cp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    cc += arr[i][j];
                }
                //array[i][i]
                if (i + j == arr.length -1) {
                    cp += arr[i][j];
                }
            }
            System.out.println(cc-cp);
        }
    }
}
