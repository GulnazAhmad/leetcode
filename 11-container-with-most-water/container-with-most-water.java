class Solution {
    public int maxArea(int[] height) {
        int maxsum=0;
        int l=0;
        int r=height.length-1;
        while(l<r){

            int min=Math.min(height[l],height[r]);
            int sum=min*(r-l);
            System.out.println(sum);
            maxsum=Math.max(sum,maxsum);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }

        }
        return maxsum;
        
    }
}