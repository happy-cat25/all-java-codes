package app_java_34;

//Sorting an array with bubble sort and printing min and max elememts in sorted array  
public class C {
	public static void main(String[] args) {
		int[] a = { 1, 23, 76, 34, 90, 23, 56 };
		int temp;

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}

		}
		for (int k = 0; k < a.length - 1; k++) {
			System.out.println(a[k]);

		}
		//min elements
		System.out.println(a[0]);
		System.out.println(a[1]);
        //max elements
		System.out.println(a[a.length - 1]);
		System.out.println(a[a.length - 2]);
	}

}
