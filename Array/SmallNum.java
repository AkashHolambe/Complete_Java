public class SmallNum {

    public static void main(String[] args) {
        int ar[] = { 9, 0, 3, 4, 5, 8, 9, 0, 58, 3, 4, 9, 0, };
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == 0) {
                ar[i] = 2;
            }
            System.out.print(ar[i] + " ");
        }

    }
}