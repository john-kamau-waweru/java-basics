class SimpleArrays {
    public static void main(String[] args) {
        int[] arr = { 20, 30, 79, 100 };

        int[] intArr = new int[5];

        for (int j = 0; j < intArr.length; j++) {
            System.out.println("Empty Array:::" + intArr[j]);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}