class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // find maximum count
        for(int num:nums)
            map.put(num, map.getOrDefault(num,0)+1);
            // map.get(num)

        int max=0;
        for(int key: map.values()){
            max = Math.max(max, key);
        }

        // int[] arr = new int[n]; int store kraane apn
        List<Integer>[] bucket = new List[max+1]; //hun List store Kraavange.. array ch

        for(int key: map.keySet()){
            int count = map.get(key);
            if(bucket[count] == null) 
                bucket[count] = new ArrayList<>();
            bucket[count].add(key);
        }

        int[] res = new int[k];

        int c=0;
        for(int i=bucket.length-1; i>=0 && c<k; i--){
            if(bucket[i]!=null){
                for(Integer num: bucket[i])
                    res[c++] = num;
            }
        }
        return res;
    }
}
