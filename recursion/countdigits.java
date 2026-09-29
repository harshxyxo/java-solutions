package recursion;

public class countdigits {
    public static void main(String[] agrs){
        int result = count(12345);
        System.out.println(result);
    }
    static int count(int n){
        if(n==0){
        return 0;
    }
    return 1 + count(n/10);
}
} 