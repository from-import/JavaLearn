package d2_recusion;

public class recusionDemo1 {
    public static void main(String[] args) {
        System.out.println(power(10));
        System.out.println(sum(10));
    }


    public static int power(int n){
        if (n == 1){
            return 1;

        }
        else{
            return power(n-1) * n;
        }
    }

    public static int sum(int n){
        if (n == 1){
            return 1;
        }
        else{
            return sum(n - 1) + n;
        }
    }

}
