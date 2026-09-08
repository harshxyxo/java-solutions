package string;

public class countparticularchar {
    public static void main(String[] args){
        String s = "banana";
        int count = 0;
        for(int i =0; i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'a'){
                count++;
            }
        }
        System.out.println(count);
    }
    
}
