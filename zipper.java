public class zipper{
	
	public static void main(String [] args) {
    
    Out.print("Zipper");
    Out.print("\n============\n");
    
    Out.print("Text: ");
    char c = In.read();
    char c2 = '\n';
    int count = 1;
    while (c!='\n'){
        if (c == c2){
            count++;
        }
        else {
            if (count>1){
              Out.print(count);
                Out.print(c);
                count = 1;  
            }
        }
        c2 = c;
        c = In.read();
    }
    
    Out.print("\nEnd ---");
    }
}