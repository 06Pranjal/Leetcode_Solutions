class Solution {
    public int firstUniqChar(String s) {

        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        char[] ch=s.toCharArray();

        for(int i=0;i<ch.length;i++){
            if(map.get(ch[i])==1){
                return i;
            }

        }
        return -1;

        
    }
}