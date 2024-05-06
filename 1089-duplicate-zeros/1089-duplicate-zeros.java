class Solution {
    public void duplicateZeros(int[] arr) {
         int count = 0;
        for(int i : arr) {
            if(i == 0) {
                count++;
            }
        }
        int len = arr.length;
        for(int i = len - 1; i >= 0; i--) {
            int temp = i + count;
            if(temp < len) {
                arr[temp] = arr[i];
            }
            if(arr[i] == 0) {
                count--;
                temp = i + count;
                if(temp < len) {
                    arr[temp] = arr[i];
                }
            }
        }
    }
}