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

    static String sorting(String[] strs){
        Arrays.sort(strs);

        // compare only 1st and last
        String left = strs[0];
        String right = strs[strs.length-1];

        int i=0;
        // StringBuilder sb = new StringBuilder("");
        while(i<left.length() && i<right.length()){
            if(left.charAt(i) != right.charAt(i))
                // return sb.toString();
                return left.substring(0,i);
            // sb.append(left.charAt(i));
            i++;
        }
        return left.substring(0,i);
    }

    public String longestCommonPrefix(String[] strs) {
        return sorting(strs);
    }
}