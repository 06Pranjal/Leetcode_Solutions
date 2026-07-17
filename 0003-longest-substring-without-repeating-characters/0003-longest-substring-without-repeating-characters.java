class Solution {
    public int lengthOfLongestSubstring(String s) {

        int low = 0;
        int high = 0;
        HashSet<Character> set=new HashSet<>();

        int k = 0;

        while (high < s.length()) {

            char ch = s.charAt(high);

            if (!set.contains(ch)) {
                set.add(ch);

                k = Math.max(k, set.size());

                high++;
            } else {
                set.remove(s.charAt(low));
                low++;
            }
        }

        return k;
    }
}