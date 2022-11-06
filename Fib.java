//求斐波那契数列的第n项。(迭代实现
//1、1、2、3、5、8、13、21、34
import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        while(reader.hasNextInt()) {
            int num = reader.nextInt();

            int f1 = 1;
            int f2 = 1;
            int f3 = 0;
            for (int i = 3; i <= num; i++) {
                f3 = f1+f2;
                f1 = f2;
                f2 = f3;
            }
            if(num <= 2) {
                System.out.println(1);
            } else {
                System.out.println(f3);
            }
        }
    }
}
