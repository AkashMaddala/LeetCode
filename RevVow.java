class Solution {
    public String reverseVowels(String s) {
        char [] ch = s.toCharArray();
        int i = 0;
        int j = s.length();
        while(i < j){
            if((ch[i] != 'a') || (ch[i] != 'A') || (ch[i] != 'e') || (ch[i] != 'E') || (ch[i] != 'i') || (ch[i] != 'I') || (ch[i] != 'o') || (ch[i] != 'O') || (ch[i] != 'u') || (ch[i] != 'U')) i++;
            else if((ch[j] != 'a') || (ch[j] != 'A') || (ch[j] != 'e') || (ch[j] != 'E') || (ch[j] != 'i') || (ch[j] != 'I') || (ch[j] != 'o') || (ch[j] != 'O') || (ch[j] != 'u') || (ch[j] != 'U')) j--;
            else if(( ch[i] == 'a'  && ch[j] == 'a') || (ch[i] == 'e'  && ch[j] == 'E') || (ch[i] == 'i'  && ch[j] == 'I') || (ch[i] == 'o'  && ch[j] == 'O') || (ch[i] == 'u'  && ch[j] == 'U')){
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                    i++;
                    j--;
            }
            else {
                  i++; 
                  j--;
            }
        }
    return new String(ch);
    }
}