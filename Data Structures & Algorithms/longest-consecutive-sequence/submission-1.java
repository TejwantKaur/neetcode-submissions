class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0||n==1) return n;
        int res=0;
        Arrays.sort(nums);
        int cnt=1;
        for(int i=1; i<n; i++){
            if(nums[i]==nums[i-1])
                continue;
            if(nums[i-1]+1 == nums[i])
                cnt++;
            else {
                res = Math.max(res, cnt);
                cnt=1;
            }
        }
        return Math.max(res, cnt); 
    }
}
