package sorting.cyclicsort;
import java.util.Scanner;
import java.util.Arrays;

public class takeInputbyUser {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the elements of the array");
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
    }
    System.out.println("Original array: " + Arrays.toString(arr));
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
        }
    }
}
