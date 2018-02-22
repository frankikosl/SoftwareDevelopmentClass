public class isprime {
    public static void main (String[] args){
      Out.println("ISPrime!");
      Out.println("=========================");
      for (int i = -1; i <= 10; i++){
        Out.print(i);
        if (isPrime(i)) Out.println(" is prime");
        else Out.println(" is no prime");

      }
      Out.println("End!");
    }
    static boolean isPrime (int num){
      for (int i = 2; i < num; i++){
        if (num % i == 0){
          return false;
          }
        }
        if (num < 2){
            return false;
        }
        else return true;
    }
}
