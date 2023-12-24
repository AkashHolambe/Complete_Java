public class revArray {
    public static void main(String[] args) {

        int arr[] = { 4, 6, 7, 73, 8, 46, 8 };
        int rev = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > rev) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
