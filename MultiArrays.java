public class MultiArrays {
    public static void main(String[] args) {
        int[][] arr = { { 4, 7, 8 }, { 20, 78, 90, 1000 }, { 230, 767, 9 } };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
