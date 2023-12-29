import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int Tableof = sc.nextInt();

        int i = 1;
        sc.close();
        while (i <= 10) {
            int mul =Tableof *i;
            System.out.println(mul);
            i++;
        }
    }
}
