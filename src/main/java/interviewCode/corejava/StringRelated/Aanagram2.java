package interviewCode.corejava.StringRelated;

import java.util.*;

public class Aanagram2 {
    private static Map<String, List<String>> anagramMap = new HashMap<>(100);

    public static void main(String sa[]){
        String [] input = {"akka","akak","baab","baba","bbaa"};

        for(String s: input){
            char[] word = s.toCharArray();
            Arrays.sort(word);
            String key = String.valueOf(word);

            if(!anagramMap.containsKey(key)){
                anagramMap.put(key,new ArrayList<String>());
            }else{
                anagramMap.get(key).add(s);
            }
        }
        System.out.println("anagram : "+anagramMap);
    }
}
