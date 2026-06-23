class Solution {
    public void merge(int[] nums, int st, int mid, int end){
        int temp[] = new int[end-st+1];
        int i=st; // array 1 
        int j=mid+1; // array 2

        int k=0;
        while(i<=mid && j<=end){
            if(nums[i]<nums[j])
                temp[k++] = nums[i++];
            else
                temp[k++] = nums[j++];
        }
        while(i<=mid){
            temp[k++] = nums[i++];
        }
        while(j<=end){
            temp[k++] = nums[j++];
        }

        // copy in original array
        i = st;
        for(int m=0; m<temp.length; m++){
            nums[i++] = temp[m];
        }
    }

    public void mergeSort(int[] nums, int st, int end){
        if(st>=end) return;

        int mid = st + (end-st)/2;
        mergeSort(nums, st, mid);
        mergeSort(nums, mid+1, end);

        merge(nums, st, mid, end);
    }

    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
}