class Solution {
    public boolean isPalindrome(String s) {

        int low=0;
        int high=s.length()-1;
        s=s.toLowerCase();

        while(low<high){
            char ch1=s.charAt(low);
            char ch2=s.charAt(high);

            if(!Character.isLetterOrDigit(ch1)){
                
                    low++;
                }
                else if(!Character.isLetterOrDigit(ch2)){
                    high--;
                }
                else{
                    if(ch1!=ch2){
                        return false;
                    }
                    low++;
                    high--;
                }
                
            } 
             return true;

        }
       
    }
