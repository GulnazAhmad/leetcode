class Solution {
    public int[] countBits(int n) {
        int [] arr= new int[n+1];
        arr[0]=0;
        for(int i=1;i<n+1;i++){
            int count=0;
            int x=i;
            while(x!=0){
                int rem=x%2;
                if(rem==1){
                    count+=1;
                }
                x=x/2;
            }
            arr[i]=count;
        }
        return arr;
        
    }
}