public class MinValue {

  public static void main(String[] args) {
    int arr[] = { 65, 34, 65, 23, 9, 57, 8, 87, 92 };
    System.out.println(min(arr));
  }

  static int min(int arr[]) {
    // To find min number form above array we are going to use liner search

    int ans = arr[0];

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < ans) {
        ans = arr[i];
      }
    }

    return ans;
  }
}
