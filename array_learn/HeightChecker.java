import java.util.Arrays;

public class HeightChecker {
    public static int heightChecker(int[] height){
        int count = 0;
        int[] temp = height.clone();
        Arrays.sort(temp);
        for(int i = 0; i < height.length; i++){
            if(temp[i] != height[i])
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] height = {1,3,2,5,4};
        System.out.println(heightChecker(height));
    }
}