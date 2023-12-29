public class PrintNumber {

    public static void main(String[] args) {
        int n = 54533;
        while (n > 0) {
            int last_num = n % 10;
            System.out.print(last_num + " ");
            n /= 10;
        }
    }
}