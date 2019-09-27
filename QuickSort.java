import java.util.Random;

public class QuickSort implements SortingAlgorithm {
    @Override
    public void sort(int[] a) {
        int length = a.length;
        quickSort(a, 0, length - 1);

    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int stard = arr[start];
            int low = start;
            int high = end;
            while (low < high) {
                while (low < high && stard <= arr[high]) {
                    high--;
                }

                arr[low] = arr[high];
                while (low < high && arr[low] <= stard) {
                    low++;
                }
                arr[high] = arr[low];
            }
            arr[low] = stard;
            quickSort(arr, start, low);
            quickSort(arr, low + 1, end);
        }
    }
    public static void main(String[] args) {
        final int size = 10;
        Random random = new Random();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = random.nextInt(20);
        }

        new QuickSort().sort(a);
        for (int temp : a) {
            System.out.println(temp);
        }
    }

}
