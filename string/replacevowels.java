package string;

public class replacevowels {
    public static void main(String[] args){
        String s = "hello";
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                sb.append('*');
            } else {
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
    
}
