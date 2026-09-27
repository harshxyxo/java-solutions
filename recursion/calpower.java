package recursion;

public class calpower {
    public static void main(String[]args){
        int result = power(2,5);
        System.out.println(result);
    }
    static int power(int x,int n){
        if(n==0){
            return 1;
        }
        return x * power(x,n-1);
    }
    
}
