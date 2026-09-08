package sorting.cyclicsort;
import java.util.Arrays;

public class cyclicsortCode {
    public static void main(String[]args){
        int[] arr = {3, 5, 2, 1, 4};
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void cyclicsort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correctindex = arr[i]-1;
            if(arr[i] != arr[correctindex]){
                int temp = arr[i];
                arr[i] = arr[correctindex];
                arr[correctindex] = temp;
            }else{
                i++;
            }
        }
    }
    
}
