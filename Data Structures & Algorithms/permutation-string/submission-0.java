class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int left=0;
        int freq[]=new int[26];
        int windowsize[]=new int[26];
        if(s1.length()>s2.length())
        {
            return false;
        }
        for(int i=0;i<s1.length();i++)
        {
            freq[s1.charAt(i)-'a']++;
            windowsize[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(freq,windowsize))
        {
            return true;
        }
        for(int right=s1.length();right<s2.length();right++)
        {
            windowsize[s2.charAt(right)-'a']++;
            windowsize[s2.charAt(left)-'a']--;
            left++;
            if(Arrays.equals(freq,windowsize))
            {
                return true;
            }
        }
        return false;
        
    }
}
