public class isideal {
    public static void main (String[] args){
        Out.println("ISIdeal!");
        Out.println("=========================");
        int count = 0;
        int i = 0;
        while (count < 10){
            if (isIdeal(i)){
                Out.print(i);
                Out.println(" is ideal");
                count++;
            }
            i++;

        }
        Out.println("End!");
    }
    static boolean isIdeal (int num){
        int sum = 0;
        if (num <= 1){
            return false;
        }
        else{
            for (int i = 2; i <= (num/2); i++){
                if (num % i == 0){
                    sum+= i;
                }
            }
            if (sum + 1 == num){
                return true;
            }
            else{
                return false;
            }
        }
    }
}
