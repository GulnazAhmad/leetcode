class Solution {
    public int[] twoSum(int[] nums, int target) {
                List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());

        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=nums[i];
            int rem=target-sum;
            if(list.contains(rem)){
                int j= list.indexOf(rem);
                if(i!=j){
                return new int[]{ i,j};
                }
            }

        }
    return  new int []{}  ;
    }
}