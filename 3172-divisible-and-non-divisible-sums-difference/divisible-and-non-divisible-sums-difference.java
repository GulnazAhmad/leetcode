class Solution {
    public int differenceOfSums(int n, int m) {
        int num1=0;
        int num2=0;
        for(int i=1;i<=n;i++){
            if(i%m!=0){
                num1=num1+i;
                System.out.println(num1);

            }
            else if(i%m==0){
                                System.out.println(num2);

                num2=num2+i;
            }
        }
        System.out.println(num1);
                System.out.println(num2);

        return num1-num2;
    }
}