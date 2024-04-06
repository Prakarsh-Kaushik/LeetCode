class Solution {
    public int strStr(String haystack, String needle) {
        int haystackLength=haystack.length();
        int needleLength=needle.length();
        
        if(haystackLength<needleLength)
            return -1;
        
        for(int i=0;i<=haystackLength-needleLength;i++){
            int j=0;
            while(j<needleLength && haystack.charAt(i+j)==needle.charAt(j))
                j++;
            if(j==needleLength){
                return i;
            }
        }
        return -1;
    }
    
}