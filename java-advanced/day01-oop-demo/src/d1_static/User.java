package d1_static;

public class User {
    // 记录在线人数
    // 静态成员变量，可被共享

    public static int onlineNumber = 100;

    private String name;
    private int age;

    public static void main(String[] args) {
        onlineNumber += 1;

    }
}
