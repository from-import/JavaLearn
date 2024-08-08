package d2_recusion;

public class BuyIt {
    public static void main(String[] args) {
        System.out.println(drinkNumber(10));
    }

    public static int drinkNumber(int money){
        int drinkBottleCup = 0;
        int drinkBottle = 0;
        int drink = 0;
        int alreadyDrink = 0;

        while(money >= 2 || drinkBottleCup >= 4 || drinkBottle >= 2 || drink > 0){
            if(money >= 2){
                money -= 2;
                drink += 1;
            }
            if(drinkBottleCup >= 4){
                drinkBottleCup -= 4;
                drink += 1;
            }
            if(drinkBottle >= 2){
                drinkBottle -= 2;
                drink += 1;
            }
            if(drink > 0){
                alreadyDrink += 1;
                drinkBottleCup += 1;
                drinkBottle += 1;
                drink -= 1;

            }
        }
        return alreadyDrink;
    }
}
