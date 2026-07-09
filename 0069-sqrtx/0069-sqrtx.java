class Solution {
    public int mySqrt(int x) {

        int low=0;
        int high=x;
        int ans=0;

        

        while(low<=high){
            int mid=low+(high-low)/2;
            long square=1L*mid*mid;
            if(square>x){
                high=mid-1;
            }else if(square<x){
                low=mid+1;
                ans=mid;
            }else{
                return mid;
            }
        }
        return ans;
        
    }
}