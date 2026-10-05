import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {
        int i =0;
        ArrayList<String> answer = new ArrayList<>(n);
    //    int j=0;
        for(i=1;i<=n;i++){
            if(i%3==0 &&i%5==0){
                //  answer[i]="FizzBuzz";
                answer.add("FizzBuzz");
            }
            else if(i%3==0){
                // answer[i]="Fizz";
                answer.add("Fizz");
            }
            else if (i%5==0) {
                //answer[i]="Buzz";
                answer.add("Buzz");
            }
            else{
                // answer[i]= String.valueOf(i);
                answer.add(String.valueOf(i));
            }
          //  j++;
        }
        return answer;
    }
}