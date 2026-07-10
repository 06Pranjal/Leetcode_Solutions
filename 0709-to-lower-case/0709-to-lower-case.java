class Solution {
    public String toLowerCase(String s) {
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>='A' && arr[i]<='Z'){
                arr[i]=(char)(arr[i]+32);
            }
        }
        s = new String(arr);
        return s;
    }
}