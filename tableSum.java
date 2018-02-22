class tableSum {

	public static void main (String [] args) {

		Out.print("\nTableSum");
		Out.print("\n=====================\n");

		// Tabelle mit ganzen Zahlen
		int[][] a = {{1,2,3} , {4,5,6}}; 	// nur positive Zahlen!

		sumTable(a);

		Out.print("\n=====================\n");

	} // main

	static void sumTable(int [][] table) {
		if (table == null) return;
		if (table.length  <= 0) return;

		int [] colSum = new int[table[0].length];

		for (int row = 0; row < table.length; row++){

			int sum = 0;
			if (table[row] == null || (table[0].length != table[row].length)){
				Out.print("----x-x-x----");
			}
			else{
				for(int col = 0; col < table[row].length; col++){
					Out.print(table[row][col]+ "   ");
					sum += table[row][col];
					colSum[col] = colSum[col] + table[row][col];
				}
			}
			Out.print(" = " + sum);
			Out.print("\n");
		}
		for (int i = 0; i< colSum.length; i++){
			Out.print(colSum[i] + "   ");
		}
	}
}
// TODO
