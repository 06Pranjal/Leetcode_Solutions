class Solution {
    public boolean isPerfectSquare(int num) {
        int low=1;
        int high=num;
        boolean ans;

        while(low<=high){
            int mid=low+(high-low)/2;
            long square=1L*mid*mid;

            if(square>num){
                high=mid-1;
            }
            else if(square<num){
                low=mid+1;
            }else{
                return true;
            }
        }
        return false;
    }
}