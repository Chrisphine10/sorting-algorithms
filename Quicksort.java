import java.util.Arrays;

public class Quicksort {
    public static void main(String[] args) {
        Integer[] array = new Integer[] { 9, -3, 5, 2, 6, 8, -6, 1, 3 };

        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(Integer[] arr, int low, int high) {
        if (arr == null || arr.length == 0) {
            return;
        }

        int middle = low + (high - low) / 2;
        int pivot = arr[middle];

        int i = low, j = high;

        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        if (low < j) {
            quickSort(arr, low, j);
        }
        if (high > i) {
            quickSort(arr, i, high);
        }

    }

    private static void swap(Integer[] arraySwap, int x, int y) {
        int temp = arraySwap[x];
        arraySwap[x] = arraySwap[y];
        arraySwap[y] = temp;
    }
}