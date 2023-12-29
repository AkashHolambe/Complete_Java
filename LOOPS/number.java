import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        // This is a programe to reverse a number

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        while (n > 0) {
            int lastdigit = n % 10;
            System.out.print(lastdigit + " ");
            n = n / 10;
        }
        System.out.println();

    }
}
