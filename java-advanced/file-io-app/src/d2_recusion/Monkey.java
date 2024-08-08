package d2_recusion;

public class Monkey {
    public static void main(String[] args) {
        System.out.println(getPeachByDay(1));
    }

    // getPeach(n) = 2 * getPeach(n-1) + 2
    // get: getPeach(1)
    // known: getPeach(10) = 1

    public static double getPeachByDay(int day){
        if(day == 10){
            return 1;
        }
        else{
            return 2 * getPeachByDay(day + 1) + 2;
        }

    }
}
