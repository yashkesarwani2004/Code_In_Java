public class Rev {

    public static void main(String args[]) {
        int arr[] = { 1, 2, 5, 9, 4 };
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}
