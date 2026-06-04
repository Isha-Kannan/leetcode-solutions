class Solution {
    public boolean wordPattern(String pattern, String s) {
        //test
        String [] word = s.split(" ");
        if(pattern.length()!= word.length)
            return false;

        HashMap<Character,String> hp = new HashMap<>();

        for(int i=0;i<pattern.length();i++){

            Character ch = pattern.charAt(i);
            String w = word[i];

            if(hp.containsKey(ch)){
                    if(!hp.get(ch).equals(w))
                        return false;
            }
                    else {
                        if(hp.containsValue(w))
                            return false ;
                        hp.put(ch,w);
           
                    }
    }
         return true;
    }
}