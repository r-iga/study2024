package study.q4;

public class Program {
	public static void main(String[] args) {
		int[] a = { 4, 2, 7, 4, 2, 8, 9, 7 };
		int[] b = r(a);
		for (int i : b) {
			System.out.print(i + " ");
		}
	}

	static int[] r(int[] arr) {
		int l = arr.length;
		int[] temp = new int[l];
		int c = 0;

		for (int i = 0; i < l; i++) {
			boolean duplicate = false;
			for (int j = 0; j < c; j++) {
				if (arr[i] == temp[j]) {
					duplicate = true;
					break;
				}
			}
			if (!duplicate) {
				temp[c++] = arr[i];
			}
		}

		int[] result = new int[c];
		System.arraycopy(temp, 0, result, 0, c);
		return result;
	}
}
