class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        int arr[]=new int[256];
        int arr1[]=new int[256];
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            char ch=t.charAt(i);
            if(arr[c]==0 && arr1[ch]==0)
            {
                arr[c]=ch;
                arr1[ch]=c;
            }
            if(c!=arr1[ch] && ch!=arr[c])
            {
                return false;
            }
        }
        return true;
    
    }
}