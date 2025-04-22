import java.util.Scanner;

// This line defines a class named HelloBasics.
// In Java, ALL code must be inside a class.
public class HelloBasics {

    // This is the main method.
    // Java always looks for this method to start your program.
    public static void main(String[] args) {


        // Create an object of HelloBasics class to use its method
        HelloBasics myObject = new HelloBasics();  // Object created from the class

        Scanner input = new Scanner(System.in);

     System.out.print("Print age B: ");
        int ageA = input.nextInt();  

     System.out.print("Print age A: ");
        int ageB = input.nextInt(); 

     int totalAge = myObject.addNumbers(ageA, ageB);

     System.out.println("Sum: " + totalAge);

        input.close();
    }

    // This is a method (also called a function) that adds two numbers.
    // It takes two int parameters and returns an int result.
    public int addNumbers(int a, int b) {
        int x = a + b;  // Add a and b, store in x
        return x;       // Return the result
    }
}


