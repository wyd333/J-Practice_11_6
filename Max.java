public class Max {
    public static void main(String[] args) {
        System.out.println(max(67, 78));
        System.out.println(max(0.6, 8.9, 7.3));
    }
    //Ҫ�󲻽�������2�����������ֵ����������3��С�������ֵ��
    public static int max(int n1, int n2) {
        return n1 > n2 ? n1 : n2;
    }
    public static double max(double d1, double d2, double d3) {
        double tmp = d1 > d2 ? d1 : d2;
        return tmp > d3 ? tmp : d3;
    }
}
