class StrinXtester{
  public static void main (String[] args){
     char [] text = {'H','a','l','L','i','g','a','L','l','i'};
      StrinX strinX1 = new StrinX("This is my StrinX");
      StrinX strinX2 = new StrinX(text);
      StrinX strinX3 = new StrinX(strinX1);
      StrinX strinX4 = new StrinX("Strinx Strinx Strinx");
      StrinX strinX5 = new StrinX("strinX");
      StrinX strinX6 = new StrinX("Strinx");
      StrinX strinX7 = new StrinX("Stri");
      StrinX strinX8 = new StrinX("L");


      Out.println("Length 1: " + strinX1.length()); //length
      Out.println("Length 2: " + strinX2.length());

      Out.println("StrinX2 to String");
      Out.println(strinX2.toString()); //toString

      Out.println("Concatenate: "); //concatenation
      strinX3.concat("Hallo!");
      Out.println(strinX3);

      Out.print("Char at 2: "); //charAt
      Out.println(strinX1.charAt(2));

      Out.println("To Char Array: ");
      char [] array = strinX1.toCharArray(strinX1); //toCharArray
      for (int i = 0; i < array.length; i++){
        Out.print(array[i] + " ");
      }

      Out.print("\nReplace Strinx to strinX in " + strinX4.string + " - Times: "); //replace
      Out.println(strinX4.replace(strinX6, strinX5));
      Out.println(strinX4.string);

      Out.print("\nReplace strinX to stri in " + strinX4.string + " - Times: "); //replace
      Out.println(strinX4.replace(strinX6, strinX7));
      Out.println(strinX4.string);

      Out.print("Compare x1 to x2, then x2 to x1: "); //compare
      Out.print(strinX1.compare(strinX2) + " ");
      Out.println(strinX2.compare(strinX1));

      Out.print("Index of L in "+ strinX2 + " starting from 2: "); //indexOf
      Out.println(strinX2.indexOf(strinX8, 2));

      Out.print("Index of L in "+ strinX2 + " starting from 9: "); //indexOf
      Out.println(strinX2.indexOf(strinX8, 9));

      Out.print("Starts with H a l in "+ strinX2 + ": "); //startsWith
      Out.println(strinX2.startsWith("Hal"));

      Out.print("Starts with BiBop in "+ strinX2 + ": "); //startsWith
      Out.println(strinX2.startsWith("BiBop"));
  }
}
