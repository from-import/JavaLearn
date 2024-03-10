package scanner;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        // 创建一个Scanner对象，用于接收键盘输入
        Scanner scanner = new Scanner(System.in);

        // 提示用户输入年龄
        System.out.print("Age:");

        // 读取用户输入的年龄
        int age = scanner.nextInt();

        // 输出用户输入的年龄
        System.out.println("You are " + age);
        scanner.nextLine(); // 清除换行符


        System.out.print("Your name:"); // print 不换行 , println 自动换行

        String name = scanner.nextLine();
        System.out.println("Your name:" + name);

        // 关闭Scanner对象
        scanner.close();
    }
}
