class Solution {
    public int totalFruit(int[] fruits) {
        List<Integer> x= new ArrayList<>();
        int maxsize=0;
        Set<Integer> set= new HashSet<>();
           // initialize with first two if available
        if (fruits.length > 0){
             x.add(fruits[0]);
            set.add(fruits[0]);
            };
        if (fruits.length > 1) {
            x.add(fruits[1]);
            set.add(fruits[1]);
            };
                maxsize = Math.max(maxsize, x.size());

        for (int i=2;i<fruits.length;i++){
            x.add(fruits[i]);
            set.add(fruits[i]);

             while(set.size()>2 && !x.isEmpty()){
                    int removed=x.remove(0);
                    if(!x.contains(removed)){
                        set.remove(removed);
                    }
             }
            maxsize=Math.max(maxsize,x.size());


           
       



        }
        return maxsize;

    }
}