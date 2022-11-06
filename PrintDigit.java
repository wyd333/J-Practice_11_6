import java.util.Scanner;

public class PrintDigit {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        while(reader.hasNextInt()) {
            int num = reader.nextInt();
            int tmp = num;
            while(tmp != 0) {
                System.out.println((tmp % 10));
                tmp /= 10;
            }
        }
    }
}
