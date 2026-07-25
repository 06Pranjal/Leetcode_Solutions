class Solution {
    public boolean validPalindrome(String s) {

        int low=0;
        int high=s.length()-1;

        while(low<high){
            char ch1=s.charAt(low);
            char ch2=s.charAt(high);

            if(ch1==ch2){
                low++;
                high--;
            }else{
                return isPalin(s,low+1,high) || isPalin(s,low,high-1);

            }
        }
        return true;
        
    }

    public boolean isPalin(String s,int low,int high){
        while(low<high){
            if (s.charAt(low) != s.charAt(high)) {
                return false;
            }

            low++;
            high--;
        }

        return true;
        }   
    }
