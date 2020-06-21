class plusoneSolution {
    public static int[] plusOne(int[] digits) {
            for(int i = digits.length-1; i >= 0; i--){
                digits[i]++;
                digits[i] = digits[i] % 10;
                if(digits[i] != 0) return digits;
            }
            digits = new int [digits.length + 1];
            digits[0] = 1;
            return digits;
    
        }
    public static void main(String[] args) {
        
        int[] d = {9,8,9};
        d = plusOne(d);
        for(int i=0;i<d.length;i++){
            System.out.println(d[i]);
        }
    }
    
    

}