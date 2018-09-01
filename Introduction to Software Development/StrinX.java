class StrinX {
  //attributes
  char[] array;
  String string;
  //constructors
  public StrinX() { /* creates an empty string */
    this.string = new String();
    this.array = this.string.toCharArray();
  }
  public StrinX (char[] data) { /* Inits the instance with the characters found in data */
    this.array  = data;
    this.string = String.valueOf(this.array);
  }
  public StrinX (String str)  { /* Inits the instance with characters of string str */
    this.string = str;
    this.array = this.string.toCharArray();
  }
  public StrinX (StrinX str)  { /* Inits the instance with the characters of StrinX str */
    this.string = str.string;
    this.array = str.array;
  }
  //methods
  public int length() { /* Returns the length of the string */
    return this.array.length;
  }
  public String toString() { /* Returns the string as an instance of java.lang.String */
    return String.valueOf(this.array);
  }
  public void concat(String s) { /* Adds string s to the end of the existing string */
    this.string += s;
    this.array = this.string.toCharArray();
  }
  public char charAt(int index) { /* Returns the char value at the specified index of the
    instance. The first char value is at index 0. Returns (char)0 for an invalid index */
    if (index > this.array.length || index < 0){
      return (char) 0;
    }
    else{
      return this.array[index];
    }
  }
  public static char[] toCharArray(StrinX s) { /* Returns a newly allocated character array
    whose length is the length of the string s and whose contents are initialized to contain the
    character sequence represented by the string s; returns null if s is null. */
    if (s == null) return null;
    else{
      s.array = s.string.toCharArray();
      return s.array;
    }
  }
  public int replace (StrinX toBeReplaced, StrinX replacement) { /* Replaces every occurrence
    of the string toBeReplaced in the string by the string replacement. Returns -1 if the two
    parameters are of different length, returns the number of replacements made otherwise. */
    if (toBeReplaced.string.length() != replacement.string.length() || toBeReplaced.string.length() > this.string.length()){
      return -1;
    }
    else{
      int occurrences = 0; //occurrences starts at 0, every occurrence adds 1, in the end returns this value
      boolean isPattern = false;
      int count = 0;
      int begin = 0;
      if (toBeReplaced.string == null || replacement.string == null || this.string == null){ //returns -1 if no text or no pattern are given
        return -1;
      }
      toBeReplaced.array = toBeReplaced.string.toCharArray();
      replacement.array = replacement.string.toCharArray();
      for (int i = begin; i < this.array.length; i++){ //iterates through the text
        count = 0;
        //checks if the characters turned to lower case are equal (to avoid high or upper case problems), or if the pattern is equal to *
        if (this.array[i] == toBeReplaced.array[0]){
          begin = i;
          int j = 1 + i;
          count = 1;
          isPattern = true; //the beginning of the pattern is true. time to iterate through the rest of it
          while (count < toBeReplaced.array.length){ //check for the length of the whole pattern
            if (j == this.array.length){ //avoids getting out of the boundary
              isPattern = false;
              break;
            }
            if (this.array[j] == toBeReplaced.array[count]) isPattern = true; //does the same check as before
            else {
              isPattern = false; //if it finds something out of the pattern, breaks and gives false
              break;
            }
            j++;
            count++;
          }
          if (isPattern) {
            occurrences++;
            for (i = 0; i < replacement.array.length; i++){
              this.array[begin + i] = replacement.array[i];
            }
            this.string = String.valueOf(this.array);
          } //if in the end Pattern manages to stay true, then it adds to the occurences
        }
      }
      return occurrences;
    }
  }
  public int compare(StrinX s) {  /*  Compares  the  string  with  s  with  respect  to  their
    containments in lexicographic order. Returns the value 0 if the argument string is equal
    to this string; a value less than 0 if this string is lexicographically less than the
    string argument; and a value greater than 0 if this string is lexicographically greater
    than the string argument. */
    return this.string.compareToIgnoreCase(s.string);
  }
  public int indexOf  (StrinX s, int fromIndex) { /* Returns the index within this string of
    the first occurrence of s, starting at the specified index; otherwise -1.*/
    boolean isPattern = false;
    s.array = s.string.toCharArray();
    this.array = this.string.toCharArray();
    int count = 0;
    int begin;
    if (fromIndex > this.array.length || fromIndex < 0) return -1;
    if (s.string == null ||this.string == null){ //returns -1 if no text or no pattern are given
      return -1;
    }
    for (int i = fromIndex; i < this.array.length; i++){ //iterates through the text
      count = 0;
      //checks if the characters turned to lower case are equal (to avoid high or upper case problems), or if the pattern is equal to *
      if (this.array[i] == s.array[0]){
        begin = i;
        int j = 1 + i;
        count = 1;
        isPattern = true; //the beginning of the pattern is true. time to iterate through the rest of it
        while (count < s.array.length){ //check for the length of the whole pattern
          if (j == this.array.length){ //avoids getting out of the boundary
            isPattern = false;
            break;
          }
          if (this.array[j] == s.array[count]) isPattern = true; //does the same check as before
          else {
            isPattern = false; //if it finds something out of the pattern, breaks and gives false
            break;
          }
          j++;
          count++;
        }
        if (isPattern) {
          return begin;
        }
      } //if in the end Pattern manages to stay true, then it adds to the occurences
    }
    return -1;
  }
  boolean startsWith(String  prefix)  {  /*  Tests  if  this  string  starts  with  the  specified prefix. */
      if (prefix.length() > this.string.length() || prefix == null || this.string == null) return false;
      char[] prefixArray = prefix.toCharArray();
      for (int i = 0; i < prefixArray.length; i++){
        if (prefixArray[i] != this.array[i]) return false;
      }
      return true;
  }
}
