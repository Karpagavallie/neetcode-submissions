class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int max=0;
        int maxlength=0;
        int freq[]=new int[128];
        for(int right=0;right<s.length();right++)
        {
           freq[s.charAt(right)]++;
           max=Math.max(max,freq[s.charAt(right)]);
           while(right-left+1-max>k)
           {
            freq[s.charAt(left)]--;
            left++;
           }
           maxlength=Math.max(maxlength,right-left+1);
        }
        return maxlength;
    }
}
