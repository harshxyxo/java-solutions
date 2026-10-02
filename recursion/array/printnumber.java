package recursion.array;

public class printnumber {
    public static void main(String[] args){
        int arr[] = {5, 10, 15, 20, 25};
        printArray(arr,0);
    }
static void printArray(int[] arr, int index){
    if (index == arr.length){
        return ;
    }
    System.out.println(arr[index]);
    printArray(arr,index+1);
}

}
