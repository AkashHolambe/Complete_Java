public class LinearSearch {
    public static void main(String[] args) {

        int arr[] = { 2, 3, 5, 6, 6, 5, 8, 9, 34 };
        int key = 9;
        for (int index = 0; index < arr.length; index++) {
            if (arr[index]==key) {
                System.out.println(index);
            }
        }
    }
}
