public class Solution{
    int sumOfLeft(int []arr,int i){
        int sum=0;
        for(int j=i-1;j>=0;j--){
            sum=sum+arr[j];
        }
        return sum;
    }
    int sumOfRight(int []arr,int i){
        int sum=0;
        for(int j=i+1;j< arr.length;j++){
            sum=sum+arr[j];
        }
        return sum;
    }
    int pivotIndex(int []arr){
        for(int i=0;i<arr.length;i++){
            if(sumOfLeft(arr,i)==sumOfRight(arr,i)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution pi=new Solution();
        System.out.println(pi.pivotIndex(new int[]{1,2,3}));
    }
}
