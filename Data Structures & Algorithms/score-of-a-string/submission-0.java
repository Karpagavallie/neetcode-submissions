class Solution {
    public int scoreOfString(String s) {
        char []c=s.toCharArray();
        int sum=0;
        for(int i=1;i<s.length();i++)
        {
            sum=sum+Math.abs(c[i]-c[i-1]);
        }
        return sum;
        
    }
}