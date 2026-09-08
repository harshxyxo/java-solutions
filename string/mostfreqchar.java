package string;

public class mostfreqchar {
    public static void main(String[] args){
        String s = "banana";
        int [] freq = new int[26];
        for(int i=0; i<s.length();i++){
            freq[s.charAt(i) -'a']++;
        }
        int max =0;
        for(int i=0; i<26; i++){
            if(freq[i] > max){
                max = freq[i];
            }
        }
        for(int i=0;i<26;i++){
            if(freq[i] == max){
                System.out.println((char)(i + 'a') + ": " + freq[i]);
            }
        }
    }
    
}
