package string;

public class firstlastwords {
    public static void main(String[] args){
        String s = "java is awesome";
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<words.length; i++){
            if(i==0 || i==words.length-1){
                sb.append(words[i]).append(" ");
            }
        }
        System.out.println(sb);
    }
    
    
}
