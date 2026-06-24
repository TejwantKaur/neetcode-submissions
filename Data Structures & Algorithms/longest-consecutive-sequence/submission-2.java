class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0||n==1) return n;
        
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }

        int res=0;
        for(int num:nums){
            if(!set.contains(num-1)){
                int cnt=1;
                while(set.contains(num+1)){
                    cnt++;
                    num+=1;
                }
                res = Math.max(res, cnt);
            }
        }
        return res;
    }
}
