package sorting.cyclicsort;
import java.util.Arrays;

public class count {
    public static void main(String[] args){
        int[] arr = {3, 5, 2, 1, 4};
        cyclicsort(arr);
    }
    public static void cyclicsort(int[] arr){
        int swaps = 0;
        int i=0;
        while(i<arr.length){
            int correctIndex = arr[i]-1;
            if(arr[i] != arr[correctIndex]){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
                System.out.println(Arrays.toString(arr));
            }
            else{
                i++;
            }
            swaps++;
        }
        System.out.println("Number of swaps: " + swaps);
    }
    
}
