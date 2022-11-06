import java.util.Scanner;

//¼ÆËã1/1-1/2+1/3-1/4+1/5 ¡­¡­ + 1/99 - 1/100 µÄÖµ
public class Sum {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();
        double n = 0;
        double sum = 0;
        int flg = 1;
        for (int i = 1; i <= num; i++) {
            n = 1.0/i*flg;
            sum += n;
            flg = -flg;
        }
        System.out.println(sum);
    }
}
