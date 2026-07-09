class Solution {

    int lastOcc(int[] nums,int target){
            int low=0;
        int high=nums.length-1;
        int ans=-1;

        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]<target){
                low=mid+1;
            }else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                ans=mid;
                low=mid+1;

            }
        }
        return ans;
        }

        int firstOcc(int[] nums, int target){
            int low=0;
            int high=nums.length-1;
            int ans=-1;

        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]<target){
                low=mid+1;
            }else if(nums[mid]>target){
                high=mid-1;
            }else{
                ans=mid;
                high=mid-1;
            }
        }
        return ans;
        }
    public int[] searchRange(int[] nums, int target) {
        
        int first=firstOcc(nums,target);
        int last=lastOcc(nums,target);


        return new int[]{first, last};

        
    }
}