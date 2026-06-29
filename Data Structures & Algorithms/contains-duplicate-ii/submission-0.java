class Solution {
    public boolean usingSet(int[] nums, int k, int n){
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<n; i++){
            if(i>k) 
                set.remove(nums[i-k-1]);

            if(!set.add(nums[i]))
                return true;
        }
        return false;
    }
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        return usingSet(nums, k, nums.length);
    }
}