class Solution {
    public int subarraySum(int[] nums, int k) {
        // sum, count
        HashMap<Integer, Integer> map = new HashMap<>();

        int sum=0, res=0;
        map.put(0,1);
        for(int num:nums){
            sum+=num;
            // look for (sum-k) in map
            if(map.containsKey(sum-k))
                res+= map.get(sum-k);
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return res;
    }
}