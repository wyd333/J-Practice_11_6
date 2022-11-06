import java.util.Scanner;

public class SumN {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        while(reader.hasNextInt()) {
            int n = reader.nextInt();
            System.out.println(sum(n));
        }

    }
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }

        return n+sum(n-1);
    }
}
