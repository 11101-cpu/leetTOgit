class Solution {
    public int addDigits(int num) {
        int sum =0;
        while(num!=0){
            int rem = num%10;
            sum = sum + rem;
            num=num/10;
        }
        String s = Integer.toString(sum);
        if(s.length()!=1){
           sum = addDigits(sum);
        }
    return sum;
    }
}