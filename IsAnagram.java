import java.util.*;
class Solution {
    public static void main(String[] args) {
        String s = "rat";
        String t = "car";
        System.out.println(isAnagram(s,t));
    }
    public static boolean isAnagram(String s, String t) {
        int [] sChar_count = new int [26];
        int [] tChar_count = new int [26];
        
        
        if(s.length()!=t.length())
            return false;
        else{
            for(int i = 0; i<s.length(); i++){
                sChar_count[s.charAt(i)-'a']++;
                tChar_count[t.charAt(i)-'a']++;                
            }            
        }
        for(int i=0;i<26;i++){
            System.out.print(sChar_count[i]+" ");            
        }
        System.out.println();
        for(int i=0;i<26;i++){
            System.out.print(tChar_count[i]+" ");
        }

        if(Arrays.equals(sChar_count, tChar_count))
            return true;
        else
            return false;
    }
}
