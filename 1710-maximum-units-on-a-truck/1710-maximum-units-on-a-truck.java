class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)->Integer.compare(b[1],a[1]));

        int n=boxTypes.length;

        int total=0;
        int ans=0;

        for(int i=0;i<n;i++){
            if(total+boxTypes[i][0]>truckSize){
                ans=ans+(truckSize-total)*boxTypes[i][1];
                break;
            }else{
                ans=ans+(boxTypes[i][0]*boxTypes[i][1]);
                total=total+boxTypes[i][0];
            }
        }
        return ans;
}
}