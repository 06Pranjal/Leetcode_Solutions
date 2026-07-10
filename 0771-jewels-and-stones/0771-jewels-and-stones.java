class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int j=jewels.length();
        int s=stones.length();
        int c=0;

        for(int i=0;i<s;i++){
            for(int k=0;k<j;k++){
                if(stones.charAt(i)==jewels.charAt(k)){
                    c++;
                }
            }
        }
        return c;
    }
}