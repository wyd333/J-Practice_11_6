import java.util.Scanner;

public class PrintDigitRecursion {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        Print(n);
    }

    public static void Print(int n) {
        if (n < 10) {
            System.out.println(n%10+" ");
            return;
        }
        Print(n/10);
        System.out.println(n%10+" ");
    }
}
