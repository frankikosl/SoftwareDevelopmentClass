public class blurMatrix {

    public static void main (String [] args) {
        Out.print("\nMatrix Blur");
        Out.print("\n=========\n");

        int [][] m1 = {{1,8,1}, //this is the example matrix
        {4,2,4}, {1,8,1}};

        // Ausgabe der 1. Matrize
        Out.print("\nMatrix: ");
        print(m1); //i just used the template from class to print the matrixes, since printing it wasn't the task i suppose that doesn't bother you

        // TESTE Addition
        Out.print("\nErgebnis");
        int [][] erg = blurMatrix(m1);
        print(erg);


        Out.print("\n=====================\n");

    } // main
    static int  [][] blurMatrix (int  [][]  matrix){
        if (matrix == null || matrix.length <= 0 ) return null; //if the matrix is null or has no length, return null
        int [][] erg = new int[matrix.length][]; //Result matrix is of the size of the given matrix
        for (int row = 0; row < erg.length; row++){
            erg[row] = new int[matrix[row].length];
            for (int col = 0; col < erg[row].length; col++){ //iterating through rows and columns
                int count = 0; //this is the amount of 'neighbors'
                int sum = 0; //this is the sum that will be divided by the count to give our blurred result
                if (row-1 >= 0 && row-1 < matrix.length){ //if the upper neighbor not out of boundaries
                    sum+= matrix[row-1][col];
                    count++;
                }
                if (row + 1 >= 0 && row+1 < matrix.length){ //if the lower neighbor not out of boundaries
                    sum+= matrix[row+1][col];
                    count++;
                }
                if (col-1 >= 0 && col-1 < matrix[row].length){ //if the left neighbor not out of boundaries
                    sum+= matrix[row][col-1];
                    count++;
                }
                if (col+1 >= 0 && col+1 < matrix[row].length){//if the right neighbor not out of boundaries
                    sum+= matrix[row][col+1];
                    count++;
                }
                sum += matrix[row][col]; //sums the value itself and adds the count for it too
                count++;
                erg[row][col] = (sum/count); //gives the durchschnitt and adds to the ergebnis matrix
            }
        }
        return erg; //done :)
    }

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
