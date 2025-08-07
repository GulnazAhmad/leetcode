class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // 1️⃣

        for(int i = 0; i < nums.length; i++) { // 2️⃣
            int rem = target - nums[i]; // 3️⃣

            if(map.containsKey(rem)) { // 4️⃣
                return new int[] { map.get(rem), i }; // 5️⃣
            }

            map.put(nums[i], i); // 6️⃣
        }

        return new int[] {}; // 7️⃣ (won’t reach here as per problem statement)
    }
}
