package string;

public class longestword {
    public static void main(String[] args){
        String s = "java is very powerful";
        String[] words = s.split(" ");
        String longest = words[0];
        for(int i = 1; i<words.length;i++){
            if(words[i].length()>longest.length()){
                longest = words[i];
            }
        }
        System.out.println("Longest word: " + longest);

    }
    
}
