class Solution {
    public int[] freq(String a){
        int freq[]=new int[26];
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
       
            freq[ch-'a']++;
        }
        return freq;
    }

    public boolean isAnagram(String s, String t) {
        if(Arrays.equals(freq(s),freq(t))){
            return true;
        }
        return false;

    }
}