
public class Prime {

    public static void main(String[] args) {

        int num = 31;
        boolean isPrime = true;
        if (num == 2) {
            System.out.println("is not a prime number");

        } else {
            for (int i = 2; i < num - 1; i++) {
                if (num % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                System.out.println("is a prime number");

            } else {
                System.out.println("Not a prime number");
            }
        }

    }
}