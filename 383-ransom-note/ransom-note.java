class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        //test
        int [] c = new int [256];

        for(int i=0;i<magazine.length();i++){
            c[magazine.charAt(i)-'a']++;
        }

        for(int i=0;i<ransomNote.length();i++){
            c[ransomNote.charAt(i)-'a']--;

            if(c[ransomNote.charAt(i)-'a']<0)
                return false;
        }
        return true;
    }
}