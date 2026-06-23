class Solution {
    public String countAndSay(int n) {
        //test
        String s = "1";

        for(int i = 1; i < n; i++) {

            int c = 1;
            String ans = "";

            for(int j = 0; j < s.length() - 1; j++) {

                if(s.charAt(j) == s.charAt(j + 1)) {
                    c++;
                }
                else {
                    ans = ans + c + s.charAt(j);
                    c = 1;
                }
            }

            ans = ans + c + s.charAt(s.length() - 1);

            s = ans;
        }

        return s;
    }
}