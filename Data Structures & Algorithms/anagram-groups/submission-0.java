class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(int i=0; i<strs.length; i++){
            String str = strs[i];
            char arr[] = str.toCharArray();

            Arrays.sort(arr);
            String sarr = new String(arr);
            
            if(!map.containsKey(sarr))
                map.put(sarr, new ArrayList<>());

            map.get(sarr).add(str);  
        }
        return new ArrayList<>(map.values());
    }
}
