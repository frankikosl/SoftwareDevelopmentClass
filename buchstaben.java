class buchstaben {

	public static void main(String [] args) {
		Out.print("Eingabeanalyse\n==========\nBitte Text eingeben: "); //eingabe der werte
		int[] result = readText();
		Out.print("Buchstabenstatistik\n----------------\n");
		printAnalysis(result);
	}
	static void printAnalysis(int[] letterCounts){
		char letter = 65;
		for (int i = 0; i < 26; i++){ //for every letter in the alphabet, print the letter and the count
			Out.print(letter + " kommt " + letterCounts[i] + "x vor.\n");
			letter++;
		}
	}
	static int[] readText (){
		char letter = ' ';
		int[] letterAppearence = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; //array empty
		while (letter != '\n'){ //while there is still text
			letter = In.read();
			switch (letter){ //checks what letter it is and adds 1 to the corresponding array slot
				case 'A': case 'a':
				letterAppearence[0]++;
				break;
				case 'B': case 'b':
				letterAppearence[1]++;
				break;
				case 'C': case 'c':
				letterAppearence[2]++;
				break;
				case 'D': case 'd':
				letterAppearence[3]++;
				break;
				case 'E': case 'e':
				letterAppearence[4]++;
				break;
				case 'F': case'f':
				letterAppearence[5]++;
				break;
				case 'G' : case 'g':
				letterAppearence[6]++;
				break;
				case 'H': case 'h':
				letterAppearence[7]++;
				break;
				case 'I': case 'i':
				letterAppearence[8]++;
				break;
				case 'J': case 'j':
				letterAppearence[9]++;
				break;
				case 'K' : case 'k':
				letterAppearence[10]++;
				break;
				case 'L' : case 'l':
				letterAppearence[12]++;
				break;
				case 'M' : case 'm':
				letterAppearence[12]++;
				break;
				case 'N' : case 'n':
				letterAppearence[13]++;
				break;
				case 'O' : case 'o':
				letterAppearence[14]++;
				break;
				case 'P' : case 'p':
				letterAppearence[15]++;
				break;
				case 'Q' : case 'q':
				letterAppearence[16]++;
				break;
				case 'R' : case 'r':
				letterAppearence[17]++;
				break;
				case 'S' : case 's':
				letterAppearence[18]++;
				break;
				case 'T' : case 't':
				letterAppearence[19]++;
				break;
				case 'U' : case 'u':
				letterAppearence[20]++;
				break;
				case 'V' : case 'v':
				letterAppearence[21]++;
				break;
				case 'W' : case 'w':
				letterAppearence[22]++;
				break;
				case 'X' : case 'x':
				letterAppearence[23]++;
				break;
				case 'Y' : case 'y':
				letterAppearence[24]++;
				break;
				case 'Z' : case 'z':
				letterAppearence[25]++;
				break;
			}
		}
		return letterAppearence; //at the end, returns the whole array
	}
}
