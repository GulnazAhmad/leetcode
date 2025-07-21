class Solution {
    public int hammingWeight(int n) {
        //get bit logic
    
String binary = Integer.toBinaryString(n);
int l=binary.length();
int count=0;  // Output: "10000"
        for(int i=0;i<l;i++){
            int maskbit=1<<i;
            //boolean x=maskbit&n;
            if((maskbit&n)>0){
                count=count+1;

            }
        }
            return count;
        
    }
}