import java.util.Random;

public class InsertionSort implements SortingAlgorithm {
	@Override
	public void sort(int[] a) {
		int size = a.length;
		for (int i = 1; i < size; i++) {
			int temp = a[i], j;
			for (j = i - 1; j >= 0; j--) {
				if (a[j] > temp) {
					a[j + 1] = a[j];
				}
				else {
					break;
				}
			}
			a[j + 1] = temp;
		}
	}

	public static void main(String[] args) {
		final int size = 10;
		Random random = new Random();
		int[] a = new int[size];
		for (int i = 0; i < size; i++) {
			a[i] = random.nextInt(20);
		}

		new InsertionSort().sort(a);
		for (int temp : a) {
			System.out.println(temp);
		}
	}
}
