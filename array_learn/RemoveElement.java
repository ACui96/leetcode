public class RemoveElement {
    public static int removeElement(int[] nums, int val){
        int length = nums.length;
        
        for(int i = 0; i < length;){
            if(nums[i] == val){
                nums[i] = nums[length - 1];
                length--;
            }
            else
                i++;
        }
        return length;
    }

    public static void main(String[] args) {
        int[] A = {1,2,3,2,4,2};
        int length = removeElement(A, 2);
        printArray(A,length);
    }
    public static void printArray(int[] arr, int length){
        System.out.println("Length of arr is: " + length);
        for(int i = 0; i < length; i++){
            
            System.out.println("Index " + i + "contains" + arr[i]);
        }
        
    }
}