package interviewCode.corejava.StringRelated;

import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {
    public boolean isAnagram(String s1,String s2){
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        if(Arrays.toString(a1).equals(Arrays.toString(a2))){
            return true;
        }
        return false;
    }

    public boolean isAanagramOptimize(String first,String second){
            int letterCount[] = new int[126];

            for(char ch : first.toCharArray()){
                letterCount[ch]++;
            }

            for(char ch : second.toCharArray()){
                letterCount[ch]--;
            }
            for(int count : letterCount){
                if(count != 0){
                    return false;
                }
            }
        return true;
    }
}
