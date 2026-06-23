class Solution {
    public void swap (int nums[], int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void sortColors(int[] nums) {
        int i=0; 
        int j=nums.length-1;
        int idx=0;

        while(idx<=j){
            while(i<j && nums[i]==0){
                i++;
                idx++;
            }

            while(i<j && nums[j]==2)
                j--;

            while(idx<=j && nums[idx]==2){
                swap(nums, idx,j);
                j--;
            }
            while(idx<=j && nums[idx]==1){
                idx++;
            }
            while(idx<=j && nums[idx]==0){
                swap(nums, idx,i);
                i++;
                idx++;
            }

        }
    
    }
}