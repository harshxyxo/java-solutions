package recursion.array;

public class sum {
    public static void main(String[] args){
        int[] arr = {2, 4, 6, 8, 10};
        int result = sum(arr, 0);
        System.out.println(result);
    }
    static int sum(int[] arr, int index){
        if(index == arr.length){
            return 0;
        }
        return arr[index] + sum (arr, index+1);
    }
    
}
