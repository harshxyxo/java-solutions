package string;

public class countwords {
    public static void main(String[] args){
        String s = "Java is very powerful";
        String[] words = s.split(" ");
        System.out.println("Number of words: " + words.length);
    }
    
}
