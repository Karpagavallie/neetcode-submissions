class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                continue;
            }
            if(Character.isLetterOrDigit(s.charAt(i)))
            {
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        StringBuilder rev=new StringBuilder();
        for(int i=sb.length()-1;i>=0;i--)
        {
            rev.append(sb.charAt(i));
        }
       if(sb.toString().equals(rev.toString()))
       {
        return true;
       }
       else
       {
        return false;
       } 
    }
}
