package d1_static;

public class StaticFieldDemo1 {
    public static void main(String[] args) {
        System.out.println(User.onlineNumber);
        User.main(null);
        System.out.println(User.onlineNumber);

        User user = new User();
        System.out.println(User.onlineNumber);
    }
}
