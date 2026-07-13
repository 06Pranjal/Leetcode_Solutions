class Solution {
    public void reverse(char[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public String reverseWords(String s) {

        StringBuilder result=new StringBuilder();
        int start=0;

        for(int i=0;i<=s.length();i++){

            if(i == s.length()||s.charAt(i)==' '){

                String word=s.substring(start,i);
                char[] arr=word.toCharArray();
                reverse(arr);

                result.append(arr);

                if (i < s.length()) {
                    result.append(' ');
                }

                start=i+1;
            }
        }
        return new String(result);       
    }
}