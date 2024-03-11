import java.util.Random;

public class Task3 {

    public static void main(String[] args) {
        System.out.println(CAPTCHA());

    }
    public static String CAPTCHA(){

        StringBuilder captcha = new StringBuilder();
        Random random = new Random();

        // 可选的字符集合
        String characters = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < 5; i++) {
            // 从字符集合中随机选择一个字符
            char randomChar = characters.charAt(random.nextInt(characters.length()));
            captcha.append(randomChar);
        }

        return captcha.toString();
    }
}
