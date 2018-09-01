public class FindMin{
	
	public static void main(String [] args) {
        

        
    }
    void shift(int[] numbers, int offset, int value){
        if(numbers == null) return;
        if (offset <= 0) return;
        
        for (int i = numbers.length-1; i >= 0; i--){
            if ((i-offset) >= 0){
                numbers[i] = numbers[i-offset];
            } else {
                numbers[i] = value;
            }
        }
        
    }
}