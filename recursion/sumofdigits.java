package recursion;

public class sumofdigits {
    public static void main(String[]agrs){
        int result = sum(12345);
        System.out.println(result);
    }
    static int sum(int n){
        if(n==0){
            return 0;
        }
        return (n%10) + sum(n/10);
    }
}
