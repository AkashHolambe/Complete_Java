public class Reverse {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 7, 8 };
        rev(arr);
    }

    static void rev(int arr[]) {
        for (int i = arr.length-1; i >= 0; i--) {
          System.out.print(arr[i]+" ");
        }
        
    }
    
}