class Solution {
    public boolean isPalindrome(String s) {
        return helper(s, 0, s.length() - 1);
    }

    public boolean helper(String s, int l, int r){
        if(l >= r) return true;

        if(!Character.isLetterOrDigit(s.charAt(l))) return helper(s, l + 1, r);
        if(!Character.isLetterOrDigit(s.charAt(r))) return helper(s, l, r - 1);

        if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) return false;
        return helper(s, l + 1, r - 1);
        
    }

    
}
   

    