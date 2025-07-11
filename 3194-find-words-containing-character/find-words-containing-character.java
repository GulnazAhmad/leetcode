class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        int l=words.length;
        List<Integer> output = new ArrayList<>();

        for(int i=0;i<l;i++){
            for(int j=0;j<words[i].length();j++){
                if(words[i].charAt(j)==x){
                    output.add(i);
                    break;
                }
            }
        }
        return output;
        
    }
}