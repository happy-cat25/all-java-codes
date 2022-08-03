package app_java_34;
//creating 2D array & printing sum of diagonal elements in it
public class E {
	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;
		arr[2][0] = 70;
		arr[2][1] = 80;
		arr[2][2] = 90;
		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j) {//to check the diagonal elements
					temp = arr[i][j] + temp;//adding diagonal elements together

				}
			}
		}
		System.out.println(temp);// sum of diagonal elements
	}

}
