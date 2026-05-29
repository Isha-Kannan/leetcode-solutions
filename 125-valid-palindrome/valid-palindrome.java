class Solution {
    public boolean isPalindrome(String s) {
        //test
        s = s.toLowerCase();
        String str = "";
        Character ch;

        for(int i=0;i<s.length();i++){
            ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch))
                str += ch;
        }

        String rev = new StringBuilder(str).reverse().toString();
        return str.equals(rev);
    }
}
