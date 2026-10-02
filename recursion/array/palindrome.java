package recursion.array;

public class palindrome {
    public static void main(String[] args){
        String s = "madam";
        System.out.println(isPalindrome(s,0,s.length()-1));
    }
    static boolean isPalindrome(String s, int left, int right){
        if(left >= right){
            return true;
        }
        if(s.charAt(left) != s.charAt(right)){
            return false;
        }
        return isPalindrome(s, left + 1, right - 1);
    }
}
