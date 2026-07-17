class Solution {
    public int lengthOfLongestSubstring(String s) {

        int low = 0;
        int high = 0;
        String n = "";

        int k = 0;

        while (high < s.length()) {

            char ch = s.charAt(high);

            if (n.indexOf(ch) == -1) {
                n = n + ch;

                k = Math.max(k, n.length());

                high++;
            } else {
                n = n.substring(1);
                low++;
            }
        }

        return k;
    }
}