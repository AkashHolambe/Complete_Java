public class BinarySearch {

  public static void main(String[] args) {
    int arr[] = { 2, 3, 4, 5, 6, 7, 8, 9 };
    int key = 9;
    int start = 0;
    int end = arr.length - 1;

    // The calculation of mid needs to be inside the loop to update it in each iteration
    while (start <= end) {
      int mid = (start + end) / 2;

      if (arr[mid] == key) {
        System.out.println("Key found at index: " + mid);
        break; // exit the loop once the key is found
      } else if (key > arr[mid]) {
        start = mid + 1; // update the start index for the right half
      } else {
        end = mid - 1; // update the end index for the left half
      }
    }
  }
}
