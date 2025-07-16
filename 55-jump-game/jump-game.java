class Solution {
    public boolean canJump(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int l=nums.length;
        int maxindex=0;
        for(int i=0;i<l;i++){
            int x=nums[i]+i;
            if(i>maxindex){
                return false;
            }
            maxindex=Math.max(maxindex,x);
            if(maxindex>=l-1){
                return true;
            }

        }
        return true;
        
    }
}