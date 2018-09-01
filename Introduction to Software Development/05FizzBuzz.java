import static java.lang.System.out;

public class 05FizzBuzz{
  int i, j = 1;
  int number = 1;
  public static void main(String[] args) {
    j = (i+1)++;
    System.out.println(j);  
    while (number<101){
      if (number%3==0&&number%5==0){
        System.out.println("FizzBuzz");
      }else{
        if (number%3==0){
          System.out.println("Fizz");
        }
        if (number%5==0){
          System.out.println("Buzz");
        }
        if (number%3!=0&&number%5!=0){
          System.out.println(number);
        }
      }
      number++;
    }
  }
}
