package app_java_34;
//to remove duplicate elements from an array
public class F {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 3, 4, 4, 5, 6, 7, 7 };
		int[] temp = new int[a.length];
		int j = 0;

		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] != a[i + 1]) {
				temp[j] = a[i];
				j++;
			}
		}
		temp[j] = a[a.length - 1];
		for (int q = 0; q < a.length; q++) {
			System.out.println(temp[q]);
		}
	}
}
