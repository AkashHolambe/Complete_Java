public class sum_while {

    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i <= 10) {
        sum = sum + i;
        System.out.println(sum);
        i++; //This increment is very very important 
        }
    }
}