//��д����ģ��������������ĳ�����
// ����������������룬
// ������ȷ����ʾ����¼�ɹ���,
// ������󣬿����������룬
// ����������Ρ�
// ���ξ�������ʾ�˳�����

import java.util.Scanner;

public class PassWord {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String pswd = "123456";
        int count = 3;
        while(count > 0) {
            String input = reader.nextLine();
            if (input.equals(pswd)) {
                System.out.println("��½�ɹ�");
                break;
            } else {
                count--;
                if(count != 0) {
                    System.out.println("�������������������" + count + "��");
                } else {
                    System.out.println("������������˳�����");
                }
            }
        }
    }
}
