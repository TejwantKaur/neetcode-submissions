class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int i=0, j=n-1;

        int maxArea = 0;
        while(i<j){
            int l = Math.min(heights[i], heights[j]);
            int b = j-i;
            int area = l*b;
            maxArea = Math.max(maxArea, area);

            if(heights[i]<heights[j])
                i++;
            else j--;
        }

        return maxArea;
        
    }
}
