package operator;

public class OperatorDemo4 {
    public static void main(String[] args) {
        double score1 = 98;
        double score2 = 50;

        System.out.println(printResult(score1));
        System.out.println(printResult(score2));
    }

    public static String printResult(double score) {
        return score >= 60 ? "Pass" : "GG";
    }
}