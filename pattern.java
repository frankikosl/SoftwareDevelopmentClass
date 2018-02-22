class pattern {

	public static void main(String [] args) {
		Out.print("Patternanalyse\n==========\n");
		char [] text = {'H','a','l','L','i','g','a','L','l','i'};
		char[] pat = {'*','a','L','l','i'};  //eingabe der gesuchte Pattern und Text
		int nrOccurrences = countPatternOccurences(text, pat); //retrieves the number of occurences
		printText(pat); //proceeds to print the result
		Out.print("  tritt in  ");
		printText(text);
		Out.print("  " + nrOccurrences+ "x auf!");

	}
	static int countPatternOccurences(char [] text, char [] pat){ //this is the most complicated part
		int occurrences = 0; //occurrences starts at 0, every occurrence adds 1, in the end returns this value
		boolean isPattern = false;
		int count = 0;
		if (text == null || pat == null){ //returns -1 if no text or no pattern are given
			return -1;
		}
		for (int i = 0; i < text.length; i++){ //iterates through the text
			count = 0;
			//checks if the characters turned to lower case are equal (to avoid high or upper case problems), or if the pattern is equal to *
			if (Character.toLowerCase(text[i]) == Character.toLowerCase(pat[0]) || pat[count] == '*'){
				int j = 1 + i;
				count = 1;
				isPattern = true; //the beginning of the pattern is true. time to iterate through the rest of it
				while (count < pat.length){ //check for the length of the whole pattern
					if (j == text.length){ //avoids getting out of the boundary
						isPattern = false;
						break;
					}
					if (Character.toLowerCase(text[j]) == Character.toLowerCase(pat[count]) || pat[count] == '*') isPattern = true; //does the same check as before
					else {
						isPattern = false; //if it finds something out of the pattern, breaks and gives false
						break;
					}
					j++;
					count++;
				}
				if (isPattern) occurrences++; //if in the end Pattern manages to stay true, then it adds to the occurences
			}
		}
		return occurrences;
	}
	static void printText(char[] input){ //this one is easy, cycles through the whole array printing all the characters
		for(int i = 0; i < input.length; i++){
			Out.print(input[i]);
		}
	}


}
