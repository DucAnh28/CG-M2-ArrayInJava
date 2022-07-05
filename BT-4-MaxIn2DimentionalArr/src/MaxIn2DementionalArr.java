public class MaxIn2DementionalArr {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5,6},{6,7,8,9,10,11}};
        int max = arr[0][0];
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]>max){
                    max = arr[i][j];
                    index1 = i;
                    index2 = j;
                }
            }
        }
        System.out.print("Max In Array " + max + " in " + index1 + index2);
    }
}
