class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        int low=1;
        int high=arr.length-2;

        

        while(low<=high){

            int mid=low+(high-low)/2;

            if(arr[mid-1]<arr[mid] && arr[mid+1]<arr[mid]){
                return mid;
            }else if(arr[mid-1]>arr[mid]){
                high=mid-1;
            }
            else if(arr[mid+1]>arr[mid]){
                low=mid+1;
            }
        }
        return -1;
    }
}