public class Task4 {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5};
        int [] nums2 = new int[5];

        arrayPrint(nums2);
        arrayCopy(nums, nums2);
        arrayPrint(nums2);

    }

    public static int[] arrayCopy(int[] a, int[] b){
        for (int i = 0; i < a.length ; i++){
            b[i] = a[i];
        }
        return b;
    }

    public static void arrayPrint(int[] a){
        for (int i = 0 ; i < a.length ; i++){
            System.out.print(i == a.length -1 ? a[i] + "\n" : a[i] + ",");
        }
    }
}
