class Solution {
    public void merge(int[] arr1, int m, int[] arr2, int n) {
        int[] result = new int[m + n];
        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (arr1[i] <= arr2[j]) {
                result[k] = arr1[i];
                i++;
            } else {
                result[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < m) {
            result[k] = arr1[i];
            i++;
            k++;
        }

        while (j < n) {
            result[k] = arr2[j];
            j++;
            k++;
        }

        for (int x = 0; x < result.length; x++) {
            arr1[x] = result[x];
        }
    }
}