public class FindMin{
	
	public static void main(String [] args) {
        

        
    }
    boolean isPalindrom(char[] text){
        String[] forward = "";
        String[] backward = "";
        if (text == null) return false;
        for (int i = 0; i <= (text.length()/2); i++){
            forward += char[i];
        }
        
        for (int i = (text.length()-1); i >= (text.length()/2); i--){
            backward += char[i];
        }
        if (backward == forward){
            return true;
        }
        else{
            return false;
        }
        
    }
}