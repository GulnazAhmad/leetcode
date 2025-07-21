class Solution {
    public int hammingDistance(int x, int y) {
        int n=x^y; //will get the binary number which has 1 in the place where digits are differnet
    //now we just need to count 1
    //get bit
    String binary=Integer.toBinaryString(n);
    int l=binary.length();
    int count=0;
    for(int i=0;i<l;i++){
        int maskbit=1<<i;
        if((maskbit&n)>0){
            count+=1;
        }
    }
    return count;
        
    }
}