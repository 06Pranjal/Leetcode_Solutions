class Solution {
    public int heightChecker(int[] heights) {

        int n=heights.length;
        int[] arr=new int[n];
        int c=0;
        int max=heights[0];
        for(int i=1;i<n;i++){
            if(heights[i]>max){
                max=heights[i];
            }
        }

        int[] count=new int[max+1];

        for(int i=0;i<n;i++){
            count[heights[i]]++;
        }
        
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;

                count[i]--;
            }
        }
        
        for(int i=0;i<n;i++){
            if(arr[i]!=heights[i])
            c++;
        }
        return c;
    }
}