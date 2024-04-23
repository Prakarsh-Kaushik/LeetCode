class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxMoney = 0;
        for(int customers[] : accounts){
            int currentMoney = 0;
            
            for(int banks : customers){
                currentMoney += banks;
            }
            maxMoney = Math.max(maxMoney, currentMoney);
        }
       return maxMoney;
    }
}