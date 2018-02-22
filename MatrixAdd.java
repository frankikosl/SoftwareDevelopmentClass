public class MatrixAdd {

    public static void main (String [] args) {
        Out.print("\nMatrixMul");
		Out.print("\n=========\n");


		// 1. Matrize
		int [][] m1 = {{1,3,2},
					   {1,2,2}};

		// 2. Matrize
		int [][] m2 = {{0,0,5},
					   {2,1,1}};

		// 3. Matrize
		int [][] m3 = {{1,2,3},
					   {4,5,6}};

		// 4. Matrize
		int [][] m4 = {{6,-1},
					   {3,2},
					   {0,-3}};



		// Ausgabe der 1. Matrize
		Out.print("\nMatrize 1");
		print(m1);

		// Ausgabe der 2. Matrize
		Out.print("\nMatrize 2");
		print(m2);


		// TESTE Addition
		Out.print("\nErgebnis");
		int [][] erg = add(m1, m2);
		print(erg);


		Out.print("\n=====================\n");

	} // main


    public static int [][] add(int[][] m1, int [][] m2)  {
			if (m1 == null || m2 == null || m1.length <= 0 || m2.length <= 0 || m2.length != m1.length) return null;

			int [][] erg = new int[m2.length][];
			for (int row = 0; row < erg.length; row++){
				if (m1[row].length != m2[row].length) return null;
				erg[row] = new int[m1[row].length];

				for (int col = 0; col < erg[row].length; col++){
					erg[row][col] = m1[row][col] + m2[row][col];
				}
			}
			return erg;




    } // end add









    public static void print(int [][] m) {

              if (m == null) {
                    Out.print(" no matrix to print!");
                    return;
              }

			  Out.print("\n---------------------\n");
              for (int row = 0; row < m.length; row++) {

                for (int col = 0; col < m[row].length; col++) {

                      Out.print(m[row][col]+ "  | ");


                } // end for
                      Out.print("\n");
           } // end for

		   Out.print("---------------------\n");

    } // end print


} // end class
