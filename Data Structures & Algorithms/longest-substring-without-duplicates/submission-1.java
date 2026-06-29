class Solution {
    static int usingSet(String s, int n){
        char[]arr = s.toCharArray();
        HashSet<Character> set = new HashSet<>();

        int i=0,len=0, maxLen=0;
        for(char ch: arr){
            if(set.contains(ch)){
                len=set.size();
                maxLen = Math.max(maxLen, len);
                while(set.contains(ch))
                    set.remove(arr[i++]);
            }
            set.add(ch);
        }
        return Math.max(maxLen,set.size());
    }
    public int lengthOfLongestSubstring(String s) {
        return usingSet(s, s.length());
    }
}
