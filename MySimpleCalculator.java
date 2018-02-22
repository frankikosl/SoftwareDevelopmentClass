class MySimpleCalculator {
    public static void main(String [] args) {
        Out.println("Hello!");
        Out.print("What's our name? ");
        String name = In.readString();
        Out.println("Hello " + name + "! Nice to meet you!");
        Out.print("I'm your JAVA machine. "); 
        Out.println("I can do calculations!");
        Out.println("Let's add two numbers.");
        Out.println("Please enter the first number: ");
        int firstNumber = In.readInt(); 
        Out.println("Please enter the second number: ");
        int secondNumber = In.readInt();
        Out.println("Doing the calculation ... ");
        int sum = firstNumber + secondNumber;
        
        Out.print("done!");
        Out.print ("The sum of " + firstNumber + " and ");
        Out.println(secondNumber + " is " + sum); 
        Out.println("Hope you enjoyed it. C U soon again! Bye!");
    } // end main()
} // end Demo 