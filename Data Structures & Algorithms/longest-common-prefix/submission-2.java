class Solution {
    public static String prefix(String[] strs){
        // if(strs.length==1) return strs[0].charAt(0);
        StringBuffer sb = new StringBuffer("");

        if(strs[0].length() == 0) return sb.toString();

        String curr = strs[0];
        // bat length
        for(int i=0; i<curr.length(); i++){
            char ch = curr.charAt(i); // b
            // strs bat bag bank band
            for(int j=1; j<strs.length; j++){ // bat
                // if()

                if(i>=strs[j].length() || strs[j].charAt(i) != ch){ // b!=b
                    return sb.toString();  
                }
            }
            sb.append(ch);
        }
        return sb.toString();
    }

    public String longestCommonPrefix(String[] strs) {
        return prefix(strs);
    }
}