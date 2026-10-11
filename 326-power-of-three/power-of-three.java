class Solution {
    public boolean isPowerOfThree(int n) {
        double num = 0;
        double nig = (double) n;
        while(num<=31){
            double no = Math.pow(3 , num);
            if(nig == no){
                return true ;
            }
            num++;
        }
        return false;
    }
}