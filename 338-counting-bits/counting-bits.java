import java.util.ArrayList;

class Solution {
    public int[] countBits(int n) {
        int num = n+1;
        int[] arr = new int[num];
        if(n==0){
            arr[0]=0;
            return arr;
        }
        while(n>0){
            int count =0;
            int og = n;
            while(og>0){
                int rem = og%2;
                if(rem == 1){
                    count++;
                }
                og=og/2;
            }
            arr[n] = count;
            n--;
        }
        return arr;
    }
}