class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n=s.length();
      
        HashMap<Character, Character> map=new HashMap<>();
                HashSet<Character> mapped = new HashSet<>();

        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))==false){
                if(mapped.contains(t.charAt(i))) return false;
                map.put(s.charAt(i),t.charAt(i));
                mapped.add(t.charAt(i));

            }
            else{
                if(map.get(s.charAt(i))!=t.charAt(i)){
                    return false;

                }
                
            }
          
        }
        return true;
    }
}
