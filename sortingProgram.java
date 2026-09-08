import java.util.Arrays;
import java.util.Scanner;
public class sortingProgram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {5, 2, 9, 1, 5, 6};
        int[] bubble = arr.clone();
        int[] selection = arr.clone();
        int[] insertion = arr.clone();
        bubbleSort(bubble);
        System.out.println(Arrays.toString(bubble));

        selectionSort(selection);
        System.out.println(Arrays.toString(selection));

        insertionSort(insertion);
        System.out.println(Arrays.toString(insertion));
    }
        static void bubbleSort(int[] arr){
            long startTime = System.nanoTime();
            int swaps = 0;
            int Comparisons = 0;
            int n = arr.length;
            for (int i = 0; i < n-1; i++){
                for (int j = 0; j < n-i-1; j++){
                    Comparisons++;
                    if (arr[j] > arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                        swaps++;
                    }
                }
            }
            System.out.println("bubbleSort:");
            System.out.println("swaps: " + swaps);
            System.out.println("comparisons: " + Comparisons);
            long endTime = System.nanoTime();
            System.out.println("Time: " + (endTime - startTime) + " ns");
        }
        static void selectionSort(int[] arr){
            long startTime = System.nanoTime();
            int swaps = 0;
            int Comparisons = 0;
            int n = arr.length;
            for (int i = 0; i < n-1; i++){
                int minIndex = i;
                for (int j = i+1; j < n; j++){
                    Comparisons++;
                    if (arr[j] < arr[minIndex]){
                        minIndex = j;
                    }
                }
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
                if(minIndex!=i){
                    swaps++;
                }
            }
            System.out.println("selectionSort:");
            System.out.println("swaps: " + swaps);
            System.out.println("comparisons: " + Comparisons);
            long endTime = System.nanoTime();
            System.out.println("Time: " + (endTime - startTime) + " ns");
        }
        static void insertionSort(int[] arr){
            long startTime = System.nanoTime();
            int n = arr.length;
            int shift = 0;
            int Comparisons = 0;
            for (int i = 1; i < n; i++){
                int key = arr[i];
                int j = i-1;
                while (j >= 0 && arr[j] > key){
                    Comparisons++;
                    arr[j+1] = arr[j];
                    j--;
                    shift++;
                }
                arr[j+1] = key;
            }
            System.out.println("insertionSort:");
            System.out.println("swaps: " + shift);
            System.out.println("comparisons: " + Comparisons);
            long endTime = System.nanoTime();
            System.out.println("Time: " + (endTime - startTime) + " ns");
        }

    }