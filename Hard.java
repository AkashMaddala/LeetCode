import java.util.*;
class Hard {
    public static void main(String[] args) {
        //String s = "ADOBECODEBANC";
        //String t = "ABC";
        String s = "ADOBECODEBANC";
        String t = "AAAABBBCC";
        System.out.println(minWindow(s,t));
    }

    public static String minWindow(String s, String t) {
        int a=0, b=0;
        HashMap<Character, Integer> space = new HashMap<Character, Integer>();
        for(int i=0;i<t.length();i++){
            if(!space.containsKey(t.charAt(i)))
                space.put(t.charAt(i),1);
            else{
                space.put(t.charAt(i), space.get(t.charAt(i)) + 1);
            }
        
            //space.add(t.charAt(i));
        }
        for (Character key: space.keySet()){
            System.out.println(key +" = "+space.get(key));
        }
        
    return "";

    }
}