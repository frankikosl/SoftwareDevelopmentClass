class Multiply {
	public static void main (String [] args) {

		Out.print("\nMultiply");
		Out.print("\n========");

		int[] numbers1 = {2,3,4,5};
		int[] numbers2 = {5,6,7,8,9};
		int [] combinded = null;


		Out.print("\n...printing multiplication table of ");
		printNumbers(numbers1);    // prints the array of INTs
		Out.print("\n   *");
		printNumbers(numbers2);    // prints the array of INTs
		Out.print("\n----------------------------------\n");
		int[][] r = multiplicationTable(numbers1, numbers2);
		printNumbers(r);

		Out.print("\nEnd! ---\n");
		/* END PROGRAM */
	} // end main

	static void printNumbers(int [] n) {
		Out.print("\n");
		if (n == null) Out.print("---");							// no array given
		for (int i = 0; i < n.length; i++) {
			Out.print(n[i]+" ");
		}
	}

	static void printNumbers(int [][] n) {
		Out.print("\n");
		if (n == null) Out.print("---");							// no array given
		for (int i = 0; i < n.length; i++) {
			Out.print("\n");
			for (int j = 0; j < n[i].length; j++) {
				Out.print(n[i][j]+" ");
			} // end for
		}
	}


	static int[][] multiplicationTable(int [] n1, int [] n2) {
			if (n1 == null || n2 == null || n1.length <= 0 || n2.length <= 0) return null;

			int [][] erg = new int[n2.length][];
			for (int row = 0; row < erg.length; row++){
				erg[row] = new int[n1.length];
				for (int col = 0; col < erg[row].length; col++){
					erg[row][col] = n1[col] * n2[row];
				}
			}
			return erg;

	} // end printMultiples

} // end class Multiplication
