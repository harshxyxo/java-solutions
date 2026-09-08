package string;
public class countuppercase {
    public static void main(String[] args) {
        String s = "jaVA ProGraMMing";
        int count =0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= 'A' && ch<= 'Z'){
                count++;
            } 
        }
        System.out.println("Number of uppercase letters: " + count);
    }
}
