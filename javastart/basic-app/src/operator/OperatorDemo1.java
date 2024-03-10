package operator;

public class OperatorDemo1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        System.out.println(a+b);
        System.out.println(1.0*a/b); // double
        System.out.println(a%b);



        int num = 768;
        int hun = num/100;
        int ten = num/10 % 10;
        int one = num%10;

        System.out.println("" + hun + ten + one);
        //能算则算，不能算就在一起

    }
}
