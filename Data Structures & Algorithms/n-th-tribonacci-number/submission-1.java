class Solution {
    public int tribonacci(int n) {
        int a=0;
        int b=0;
        int c=1;
        if(n==0)
        {
            return 0;
        }
        for(int i=1;i<n;i++)
        {
            int temp=a+b+c;
             a=b;
             b=c;
             c=temp;

        }
        return c;
        
    }
}