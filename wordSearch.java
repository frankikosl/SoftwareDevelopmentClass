public class wordSearch {

    public static void main (String [] args) {
        Out.print("\nWord Search");
        Out.print("\n=========\n");

        char [][] m1 = {{'a','b','c','d', 'H' ,'e','f','g','x' }, //this is the example matrix
        {'h','i','j','k','l','U','m','n','a','b'}, {'o','p','q','r','s','t','G','u'}, {'v','w','x','y','z','a','b','O','y'}}; //our array

        Out.print("\nIm Textfeld: ");
        print(m1); //i just used the template from class to print the matrixes, changing it to char this time
                        //since printing it wasn't the task i suppose that doesn't bother you
        Out.print("\nWas suchen Sie? ");
        String gesucht = In.readString();
        if (find(m1, gesucht)){
            Out.print(gesucht + " wurde gefunden!");
        }
        else{
            Out.print(gesucht + " wurde nicht gefunden!");
        }

        Out.print("\n=====================\n");

    } // main
    static boolean find (char[][] textField, String word){

        if (textField == null ||  textField.length <= 0 || word.length() == 0 || word == null) return false; //if null or empty, returns false
        char[] pattern = word.toCharArray(); //first, changes the string to a char array
        boolean isTrue = false;
        for (int row = 0; row < textField.length; row++){
            for (int col = 0; col <  textField[row].length; col++){ //iterating through rows and columns
                if (pattern.length > textField[row].length){
                    //so first, we check horizontal. If the length of the pattern is bigger than the row itself, we know it will be false.
                    isTrue = false;
                }
                else{ //if its not, then we check for horizontal
                    if (textField[row][col] == pattern[0]){
                        for (int i = 0; i < pattern.length; i++){
                            if (col-i >= 0 && col-i < textField[row].length){ //horizontal to the left
                                if (pattern[i] == textField[row][col-i])  isTrue = true; //checks if the whole word it there.
                                else {
                                    isTrue = false; //if one character is off, breaks the for and goes to the next search type
                                    break;
                                }
                            }
                            else{
                                isTrue = false;
                                break;
                            }
                        }
                        if (isTrue) return true; //if the whole word was there, already returns the true result
                        for (int i = 0; i < pattern.length; i++){
                            if (col+i >= 0 && col+i < textField[row].length){ //horizontal to the right
                                if (pattern[i] == textField[row][col+i])  isTrue = true;
                                else {
                                    isTrue = false;
                                    break;
                                }
                            }
                            else{
                                isTrue = false;
                                break;
                            }
                        }
                        if (isTrue) return true;
                    }
                    if (pattern.length > textField.length){ //now for the vertical and diagonal, we need to check the number of rows
                        isTrue = false;
                    }
                    else{
                        for (int i = 0; i < pattern.length; i++){
                            if (row+i >= 0 && row+i < textField.length){ //vertical going down
                                if (pattern[i] == textField[row+i][col])  isTrue = true;
                                else {
                                    isTrue = false;
                                    break;
                                }
                            }
                            else{
                                isTrue = false;
                                break;
                            }
                        }
                        if (isTrue) return true;
                        for (int i = 0; i < pattern.length; i++){
                            if (row-i >= 0 && row-i < textField.length){ //vertical going up
                                if (pattern[i] == textField[row-i][col])  isTrue = true;
                                else {
                                    isTrue = false;
                                    break;
                                }
                            }
                            else{
                                isTrue = false;
                                break;
                            }
                        }
                        if (isTrue) return true;
                        for (int i = 0; i < pattern.length; i++){ //diagonal going down
                            if (row+i >= 0 && row+i < textField.length && col+i >= 0 && col+i < textField[row+i].length){
                                if (pattern[i] == textField[row+i][col+i])  isTrue = true;
                                else {
                                    isTrue = false;
                                    break;
                                }
                            }
                            else{
                                isTrue = false;
                                break;
                            }
                        }
                        if (isTrue) return true;
                        for (int i = 0; i < pattern.length; i++){ //diagonal going up
                            if (row-i >= 0 && row-i < textField.length && col+i >= 0 && col+i < textField[row-i].length){
                                if (pattern[i] == textField[row-i][col+i])  isTrue = true;
                                else {
                                    isTrue = false;
                                    break;
                                }
                            }
                            else{
                                isTrue = false;
                                break;
                            }
                        }
                    }
                }
            }
        }
        return isTrue; //done :)
    }


    public static void print(char [][] m) {

        if (m == null) {
            Out.print(" no matrix to print!");
            return;
        }

        Out.print("\n---------------------\n");
        for (int row = 0; row < m.length; row++) {

            for (int col = 0; col < m[row].length; col++) {

                Out.print(m[row][col]+ "");


            } // end for
            Out.print("\n");
        } // end for

        Out.print("---------------------\n");

    } // end print


} // end class
