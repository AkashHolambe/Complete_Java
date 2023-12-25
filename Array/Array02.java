public class Array02 {

  public static void main(String[] args) {
    int arr[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18 };
    int key = 18;
    int start = 0;
    int end = arr.length - 1;

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
// we are finding index of 10 by using binary search
// for finding elemet with binary seach we required array in sorted form.
