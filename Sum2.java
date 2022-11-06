//在同一个类中,分别定义求两个整数的方法 和 三个小数之和的方法。 并执行代码，求出结果
public class Sum2 {
    public static int sum(int n1,int n2) {
        return n1+n2;
    }

    public static double sum(double d1, double d2, double d3) {
        return d1+d2+d3;
    }

    public static void main(String[] args) {
        System.out.println(sum(10, 67));
        System.out.println(sum(2.3, 7.8, 1.5));
    }
}
