import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character, Integer> charFrequency=new HashMap<>();
        for(char c: s.toCharArray()){
            charFrequency.put(c, charFrequency.getOrDefault(c,0)+1);
        }
   for(char c:t.toCharArray()){
       int frequency=charFrequency.getOrDefault(c,0);

       if (frequency==0){
           return false;
       }
       charFrequency.put(c,frequency-1);
   }
   return true;
    }
}
