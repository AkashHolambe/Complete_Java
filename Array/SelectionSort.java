public class SelectionSort {

  public static void main(String[] args) {
    // Selection sort where we push smaller elements to the front.
    int arr[] = { 7, 4, 5, 3, 6, 2, 1 };
    // This is a array which we are going to use for sorting 
    sort(arr);
    print(arr);
  }

  public static void sort(int arr[]) {
    for (int i = 0; i < arr.length - 1; i++) {
      int minpos = i;

      for (int j = i + 1; j < arr.length; j++) {
        if (arr[minpos] > arr[j]) {
          minpos = j;
        }
      }

      // Swap the found minimum element with the element at i this is for to assigne the small value in array to campare with other element of array.
      int temp = arr[minpos];
      arr[minpos] = arr[i];
      arr[i] = temp;
    }
  }

  public static void print(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
}
