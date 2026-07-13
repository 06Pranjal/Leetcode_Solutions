class Solution {
    public void reverse(char[] arr,int i,int j){
        
        while(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public String reverseWords(String s) {
        char[] str=s.toCharArray();
        int i=0;
        int j=0;
        while(j<str.length){
            if(str[j]!=' '){
                j++;
            }else{
                reverse(str,i,j-1);
                j++;
                i=j;
                
            }
        }
        reverse(str,i,j-1);
        return new String(str);   
    }
}