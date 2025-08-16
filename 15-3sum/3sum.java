class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);
        System.out.println(nums);
        for ( int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int l=i+1;
            int r=nums.length-1;
            while(l<r){
                            int threesum=nums[i]+nums[l]+nums[r];

                if(threesum>0){
                    r-=1;
                }
                else if(threesum<0){
                    l+=1;
                }
                else{
                    List<Integer> sublist = new ArrayList<>();

                    sublist.add(nums[i]);
                    sublist.add(nums[l]);
                    sublist.add(nums[r]);
                    res.add(sublist);
                    l+=1;
                    r-=1;
                    while(nums[l]==nums[l-1] && l<r){
                        l+=1;
                    }
                    while(nums[r]==nums[r+1] && l<r){
                        r-=1;
                    }
                }
            }
        }
        return res;
        
    }
}