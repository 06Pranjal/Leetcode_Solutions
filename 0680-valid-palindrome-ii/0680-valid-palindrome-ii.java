class Solution {
    public boolean validPalindrome(String s) {

        return check(s,0,s.length()-1,false);
    }

    private boolean check(String s,int left,int right,boolean deleted){
        if(left>=right){
            return true;
        }
        if(s.charAt(left)==s.charAt(right)){
            return check(s,left+1,right-1,deleted);
        }
        if(deleted){
            return false;
        }
        return check(s,left+1,right,true)||check(s,left,right-1,true);
    }
}