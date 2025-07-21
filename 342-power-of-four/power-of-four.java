class Solution {
    public boolean isPowerOfFour(int n) {
        //the trick is power of 2 has only one 1 which when & with its predecessor gives 0 
        //and for 4 that one is only at even position 
        if(n>0){
            if((n&(n-1))==0){//power of 2
            int x=0x55555555; //creating a hexadecimal numberHex:     5 5 5 5 5 5 5 5 Binary:  0101 0101 0101 0101 0101 0101 0101 0101
            //So only numbers with a single 1 at an even index will match.
            System.out.println(x);
            if((x&n)!=0){
                return true;
            }

            }
        }
        return false;
        
    }
}