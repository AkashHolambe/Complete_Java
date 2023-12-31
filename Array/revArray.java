public class revArray {

  public static void main(String[] args) {
    int arr[] = { 4, 6, 7, 3, 8, 6, 8 };
    rev(arr);
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
    }
  }

  static void rev(int arr[]) {
    int start = 0;
    int end = arr.length - 1;
    while (start < end) {
      int temp = arr[end];
      arr[end] = arr[start];
      arr[start] = temp;

      start++;
      end--;
    }
  }
}