import java.util.*;
public class Group_Anagrams {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] ca = new char[26];
            for (char c : s.toCharArray()) ca[c - 'a']++;
            String keyStr = String.valueOf(ca);            
            if (!map.containsKey(keyStr)) map.put(keyStr, new ArrayList<>());
            map.get(keyStr).add(s);
        }
        return new ArrayList<>(map.values());
    //     List<List<String>> listOfLists = new ArrayList<>();
    //     List<String> list1 = new ArrayList<String>();
    //     //base cases
    //     if(strs.length == 0)
    //         return listOfLists;
    //     if(strs.length == 1){
    //         list1.add(strs[0]);
    //         listOfLists.add(list1);
    //         return listOfLists;
    //     }
    //     //main logic
    //     //create a hashmap
    //     HashMap<String, ArrayList<String>> anagrams = new HashMap<>();
    //     for(int i = 0; i<strs.length; i++){
    //         String sorted = sortString(strs[i]);
    //         if(!anagrams.containsKey(sorted)){
    //             ArrayList<String> list = new ArrayList<>();
    //             list.add(strs[i]);
    //             anagrams.put(sorted, list);
    //         }else{
    //             anagrams.get(sorted).add(strs[i]);
    //         }

    //     }
    //     for (String key: anagrams.keySet()){
    //         listOfLists.add(anagrams.get(key));
    //     }
        
    //     return listOfLists;
    }

    public static String sortString(String inputString)
    {
        // Converting input string to character array
        char tempArray[] = inputString.toCharArray();

        // Sorting temp array using
        Arrays.sort(tempArray);

        // Returning new sorted string
        return new String(tempArray);
    }
}



