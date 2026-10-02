package recursion.array;

public class maxnumber {
    public static void main(String[] args){
        int[] arr = {12, 45, 7, 89, 23};
        int result = max(arr,0);
        System.out.println(result);
    }
    static int max(int[] arr, int index){
        if(index == arr.length){
            return Integer.MIN_VALUE;
        }
        return Math.max(arr[index], max(arr,index+1));
    }
    
}
