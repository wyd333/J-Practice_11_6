import java.util.Scanner;

public class FactN {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        while(reader.hasNextInt()) {
            int n = reader.nextInt();
            System.out.println(n+"的阶乘是"+fact(n));
        }
    }
    //递归求 N 的阶乘
    public static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        return n*fact(n-1);
    }
}
