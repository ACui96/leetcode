import java.util.HashSet;
import java.util.Set;

public class CheckDouble{
    public static boolean checkDouble(int[] arr){
        Set<Integer> seen = new HashSet<>();
        for(int i : arr){
            if(seen.contains(i * 2) || i % 2 == 0 && seen.contains(i / 2))
                return true;
            seen.add(i);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {-2,0,10,-19,4,6,-8};
        System.out.println("Does arr contains double: " + checkDouble(arr));
    }
}