public class Task5 {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6};
        System.out.println(minmaxClean(nums));
    }
    public static double minmaxClean(int[] nums){
        int max = nums[0];
        int min = nums[0];
        int sum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            int num = nums[i];
            max = max < num ? num : max; // 更新 max
            min = min > num ? num : min; // 更新 min
            sum += num;
        }
        return  0.25 * (sum - max - min);

    }

}
