public class FindEven {
    public static int fidNumbers(int[] nums){
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            String s = Integer.toString(nums[i]);
            if ((s.length() % 2) == 0){
                ans ++;
            }
            else
                continue;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {555,901,482,1771};
        System.out.println(fidNumbers(nums)); 
    }
}