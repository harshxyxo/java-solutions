package string;

public class checkanagram {
    public static void main(String[] args) {
    String s = "listen";
    String t = "silent";
    int[] freq = new int[26];
    for(int i=0;i<s.length();i++){
        freq[s.charAt(i)-'a']++;
    }
    for(int i=0;i<t.length();i++){
        freq[t.charAt(i)-'a']--;
    }
    boolean isAnagram = true;
    for(int i=0;i<26;i++){
        if(freq[i] != 0){
            isAnagram = false;
            break;
        }
    }
    System.out.println(isAnagram);
}
}
