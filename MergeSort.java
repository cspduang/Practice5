import java.util.*;

public class MergeSort implements SortingAlgorithm {

    @Override
    public void sort(int[] a) {
        int length = a.length;
        mergeSort(a, 0, length - 1);

    }

    public static int[] mergeSort(int[] a, int low, int high) {
        int mid = (low + high) / 2;
        if (low < high) {
            mergeSort(a, low, mid);
            mergeSort(a, mid + 1, high);
            merge(a, low, mid, high);
        }
        return a;
    }

    public static void merge(int[] a, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= high) {
            if (a[i] < a[j]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = a[i++];
        }
        while (j <= high) {
            temp[k++] = a[j++];
        }
        for (int x = 0; x < temp.length; x++) {
            a[x + low] = temp[x];
        }
    }

    public static void main(String[] args) {
        final int size = 10;
        Random random = new Random();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = random.nextInt(20);
        }

        new MergeSort().sort(a);
        for (int temp : a) {
            System.out.println(temp);
        }
    }
}
