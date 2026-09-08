package string;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String s = sc.nextLine();
        int i =0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i) !=s.charAt(j)){
               System.out.println("not palindrome");
               return;
            }else{
                i++;
                j--;
            }
        }
        System.out.println("palindrome");
    }
    
}
