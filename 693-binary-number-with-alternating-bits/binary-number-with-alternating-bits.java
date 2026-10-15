import java.util.ArrayList;

class Solution {
    public boolean hasAlternatingBits(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        while (n > 0) {
            int rem = n % 2;
            arr.add(rem);
            n = n / 2;
        }
        int[] array = new int[arr.size()];
        int j = 0;
        for (int num : arr) {
            array[j] = num;
            j++;
        }
        for (int i = 0; i < arr.size() - 1; i++) {
            if (array[i] + array[i + 1]==2 || array[i]+array[i+1]==0) {
                return false;
            }
        }
        return true;
    }
}