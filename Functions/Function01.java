package Functions;

import java.util.Scanner;

public class Function01 {
    public static void main(String[] args) {
        // Functoins are the codes which are written onces and we use anytime when we
        // required to use.
        System.out.println(sum());
        print();
        Function01 f = new Function01();
        System.out.println(f.mul(10, 7));
        f.mod(0, 0);
        

    }

    static int sum() {
        int a = 10;
        int b = 20;
        int sum = a + b;
        return sum;
    }

    static void print() {
        System.out.println("Be the best leave the reast");

    }

    // This method required object call for execution the only it get execuated
    int mul(int a, int b) {
        int multiplication = a * b;
        return multiplication;
    }

    // Method taking input form user;
    void mod(int x, int y) {
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        sc.close();
        int modulas = x % y;
         System.out.println(modulas);
    }
}