class Solution {
    public int findNumbers(int[] nums) {
       int count = 0;

        for(int i = 0; i < nums.length; i++){

            int digit = 0;
            int n = nums[i];

            //if n is less than 10 then single digit always
            if(n < 10){
                digit = 1;
                continue;
            }

            // diving by 10 to get the number of digits
            while(n > 0){
                n /= 10;
                digit++;
            }

            //if digit is even then increasing count
            if(digit % 2 == 0){
                count++;
            }
        }

        return count; 
    }
}