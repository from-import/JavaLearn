package d2_static_util;
import java.util.Random;

public class Login {

    public static String Check(int length) {
        String code = "";
        String allStr = "abcdeABCDE";
        Random r = new Random();

        for (int i = 0; i < length; i++) {
            int index = r.nextInt(allStr.length());
            code += allStr.charAt(index);
        }

        return code;  // 返回生成的字符串
    }

    public static void main(String[] args) {
        System.out.println(Check(6));
    }
}
