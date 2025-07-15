import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        int n=strs.length;
        for(int i=0;i<n;i++){
            char[] chars = strs[i].toCharArray();
            //String word = new String(chars);
            Arrays.sort(chars);
            String sorted = new String(chars);

            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
                map.get(sorted).add(strs[i]);


            }
            else{
                map.get(sorted).add(strs[i]);
            }
        }
return new ArrayList<>(map.values());

        
    }
}