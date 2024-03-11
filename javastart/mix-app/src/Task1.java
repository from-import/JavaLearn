public class Task1 {
    public static void main(String[] args) {
        // INPUT: 1.原价 2.月份 3.头等舱/经济舱
        // RULE: 5-10月 头等舱9折 经济舱8.5折 ELSE 头等舱7折 经济舱6.5折

        System.out.println(finalPrice(100,3,1));



    }
    public static double finalPrice(double price, int month, int topOrSimple ){
        double resPrice;
        if (month >= 5 & month <= 10){
            resPrice = topOrSimple == 0 ? price * 0.85 : price * 0.9;
            return resPrice;
        }
        else{
            resPrice = topOrSimple == 0 ? price * 0.65 : price * 0.7;
            return resPrice;

        }
    }
}
