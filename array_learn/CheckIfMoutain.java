public class CheckIfMoutain {
    public static boolean checkIfMoutain(int[] arr){
        int i = 0;
        int N = arr.length;

        //向上爬
        while(i + 1 < N && arr[i] < arr[i+1])
            i++;
        
        //山顶不能为第一个或最后一个元素
        if(i == 0 || i == N - 1)
            return false;
        
        //下山
        while(i + 1 < N && arr[i] > arr[i+1])
            i++;
        
        return i == N - 1;
    } 

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,1};
        System.out.println("是山峰数组吗： " + checkIfMoutain(arr));
    }
}