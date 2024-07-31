package d3_static_test;

public class ArrayUtil {
    private ArrayUtil(){};

    public static String toString(int[] array){
        // 先写检验
        if (array == null){
            System.out.println("Null");
            return null;
        }
        else if (array.length == 0){
            System.out.println("Empty array");
            return "0";
        }
        else{
            StringBuilder str = new StringBuilder();
            for(int i=0; i < array.length; i++){
                str.append(array[i]);
            }
            System.out.println("Result is " + str);
            return str.toString();

        }

    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(toString(array));
    }


}
