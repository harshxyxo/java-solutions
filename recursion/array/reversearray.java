package recursion.array;

public class reversearray {
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50};
        reverse(arr,0);
    }
    static void reverse(int[] arr, int index){
        if(index == arr.length){
            return;
        }
         reverse(arr,index+1);
        System.out.println(arr[index]);

    }
}
