class Solution {
    public boolean ispalin(String c){
        //test
        int s=0,e=c.length()-1;
        while(s<e){
            if(c.charAt(s)==c.charAt(e)){
                s++;e--;
            }
            else return false;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int n = s.length();
        String longpalin ="";
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                String str = s.substring(i,j);
                if(ispalin(str)){
                    if(longpalin.length()<str.length()) longpalin = str;
                }
            }
        }
        return longpalin;
    }
}
