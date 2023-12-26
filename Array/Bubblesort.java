public class Bubblesort {

  public static void sorting(int arr[]) {
    for (int turn = 0; turn < arr.length; turn++) {
      for (int j = 0; j < arr.length - 1 - turn; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j + 1];
          arr[j + 1] = arr[j];
          arr[j] = temp;
        }
      }
    }
  }

  public static void result(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int arr[] = { 5, 2, 1, 4, 3 };
    sorting(arr);
    result(arr);
  }
}

