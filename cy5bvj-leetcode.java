class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        
        for (int i=1; i<strs.length; i++) {
            String curr = strs[i];
            while (curr.indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length()-1);
                if (prefix.isEmpty()) {
                    return prefix;
                }
            }
        }
        
        return prefix;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String[] a = new String[]{"flower", "flow", "flight"};
        System.out.println(s.longestCommonPrefix(a));
    }
}