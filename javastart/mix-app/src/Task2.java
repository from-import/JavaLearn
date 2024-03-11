public class Task2 {
    public static void main(String[] args) {
        System.out.println(check(15));
    }
    public static int check(int num){
        for (int i = 2 ; i < num/2 ; i++){
            if (num % i == 0){
                return 0;
            }
            }
        return 1;
        }
    }
