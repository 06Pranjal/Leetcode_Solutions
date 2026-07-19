class Solution {
    public int findGCD(int[] nums) {

        int max=nums[0];
        int min=nums[0];
        int ans=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }

            if(nums[i]<min){
                min=nums[i];
            }
        }
        for(int i=2;i<=max;i++){
            if(min%i==0 && max%i==0){
                ans=i;
            }
        }
        return ans;
    }
}