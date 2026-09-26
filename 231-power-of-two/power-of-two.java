class Solution {
    public boolean isPowerOfTwo(int n) {
        double num=0;
        double nig = n;
        while(num<=31){
            if(nig == Math.pow(2,num)){
                return true;
            }
            num++;
        }
        return false;
    }
}