class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int lg=g.length;
        int ls=s.length;
        int p=0;
        int q=0;
        int count=0;
        while(p<lg && q<ls)
        {
            if(g[p]<=s[q]){
                p++;
                q++;
                count+=1;
            }
            else{
                q++;

            }

        }
        return count;
        
    }
}