
//���������������������ֵmax2
// �����дһ����3���������ֵ�ĺ���max3��
//
//Ҫ����max3��������У�����max2��������ʵ��3���������ֵ����
public class MaxNumber {
    public static void main(String[] args) {
        System.out.println(max2(10, 40));
        System.out.println(max3(70, 0, -9));
    }

    public static int max2(int num1, int num2) {
        return num1 > num2 ? num1 : num2;
    }

    public static int max3(int num1, int num2, int num3) {
        int tmp = max2(num1,num2);
        return tmp > num3 ? tmp : num3;
    }
}
