class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n>0){
        if((n&(n-1))==0)//dont write n&(n-1) will be interpreted as n &((n-1)==0)
        {
            return true;

        }
        }
        return false;
        
    }
}