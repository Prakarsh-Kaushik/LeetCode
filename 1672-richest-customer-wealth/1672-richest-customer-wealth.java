class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealthSoFar = 0;

        for(int[] customers : accounts) {
            int currentWealth = 0;

            for (int bank : customers){
                currentWealth += bank;
            }
            maxWealthSoFar = Math.max(maxWealthSoFar, currentWealth);
        }
        return maxWealthSoFar;
    }
}