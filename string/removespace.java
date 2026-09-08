package string;

public class removespace {
    public static void main(String[] args){
    String s = "java programming";
    StringBuilder sb = new StringBuilder();
    for(int i=0; i<s.length();i++){
        char ch = s.charAt(i);
        if(ch != ' '){
            sb.append(ch);
        }
    }
    System.out.println(sb);
}
}
