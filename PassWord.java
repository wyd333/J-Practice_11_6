//编写代码模拟三次密码输入的场景。
// 最多能输入三次密码，
// 密码正确，提示“登录成功”,
// 密码错误，可以重新输入，
// 最多输入三次。
// 三次均错，则提示退出程序

import java.util.Scanner;

public class PassWord {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String pswd = "123456";
        int count = 3;
        while(count > 0) {
            String input = reader.nextLine();
            if (input.equals(pswd)) {
                System.out.println("登陆成功");
                break;
            } else {
                count--;
                if(count != 0) {
                    System.out.println("密码错误，您还可以再输" + count + "次");
                } else {
                    System.out.println("三次输入错误，退出程序");
                }
            }
        }
    }
}
