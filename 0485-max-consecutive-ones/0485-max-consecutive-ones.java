class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int consecutiveOnes = 0;
        int count=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                consecutiveOnes++;
            }
            else{
                consecutiveOnes=0;
            }
            count = Math.max(count,consecutiveOnes);
        }
        return count;
    }
}