import java.util.Scanner;

public class Logic {
    // Instance Variables
    private final Scanner myScanner;
    private CircleEquation circleEquation;
    private QuadraticEquation quadraticEquation;
    // Constructors
    public Logic() {
        circleEquation = null;
        quadraticEquation = null;
        myScanner = new Scanner(System.in);
    }
    // Other Public Methods
    public void start() {
        System.out.println("Welcome to the Circle and Quadratic Equation calculator!");
        String playAgain = "y";
        while (!playAgain.equals("n")) {
            System.out.println("Would you like to do a Quadratic or Circle equation?"); // lets the user pick if they want to use the quadratic or circle equation
            String circleOrQuadratic = myScanner.nextLine();
            if (circleOrQuadratic.equals("Quadratic") || circleOrQuadratic.equals("quadratic")) {
                getQuadraticInfo();
            } else if (circleOrQuadratic.equals("Circle") || circleOrQuadratic.equals("circle")) {
                getCircleInfo();
            } else {
                System.out.println("Please enter \"Quadratic\" or \"Circle\"");
            }
            System.out.print("Would you like to calculate another equation? y/n: "); // creates a loop to run the program multiple times unless the user types n
            playAgain = myScanner.nextLine();
        }
        System.out.println("Thank you for using the calculator! Goodbye!");
    }

    public void getQuadraticInfo() {
        System.out.print("Enter a: "); // asks the user to enter their specified values
        int a = myScanner.nextInt();
        System.out.print("Enter b: ");
        int b = myScanner.nextInt();
        System.out.print("Enter c: ");
        int c = myScanner.nextInt();
        myScanner.nextLine();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        System.out.println(equation.quadraticInformation()); // prints out the information for the user
    }

    public void getCircleInfo() {
        System.out.print("Enter radius: "); // asks the user to enter their specified values
        int radius = myScanner.nextInt();
        System.out.print("Enter X value: ");
        int x1 = myScanner.nextInt();
        System.out.print("Enter Y value: ");
        int y1 = myScanner.nextInt();
        myScanner.nextLine();
        CircleEquation equation = new CircleEquation(radius, x1, y1);
        System.out.println(equation.circleInformation());  // prints out the information for the user
    }
}
