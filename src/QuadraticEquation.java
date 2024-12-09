public class QuadraticEquation {
    // Instance Variables
    private int a;
    private int b;
    private int c;
    // Constructors
    public QuadraticEquation() {
        this.a = 1;
        this.b = 0;
        this.c = 0;
    }

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    // Private Helper Method
    private double roundToHundredth(double value) {
        return Math.round(value * 100) / 100.0;
    }
    // Other Public Methods
    public String equation() {
        return "y = " + a + "x^2 + " + b + "x + " + c; // returns the quadratic equation
    }

    public String yIntercept() {
        return "(0, " + c + ")"; // returns the y-intercept
    }

    public String min() {
        if (a > 0) {
            return "Minimum y-value: " + roundToHundredth(vertexY()); // returns the rounded min
        }
        return "No minimum (parabola opens downward)";
    }

    public String max() {
        if (a < 0) {
            return "Maximum y-value: " + roundToHundredth(vertexY()); // returns the rounded max
        }
        return "No maximum (parabola opens upward)";
    }

    private double vertexY() {
        double x = axisOfSymmetry();
        return a * x * x + b * x + c; // returns the y vertex
    }

    public double axisOfSymmetry() {
        return -(double) b / (2 * a); // returns the axis of symmetry
    }

    public String vertex() {
        double x = axisOfSymmetry();
        double y = vertexY();
        return "(" + roundToHundredth(x) + ", " + roundToHundredth(y) + ")"; // returns the vertex
    }

    public String zeros() {
        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            return "No real roots";
        }
        double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        return "x = " + roundToHundredth(root1) + ", " + roundToHundredth(root2); // returns the zeros in the equation
    }

    public String calculateYValues() {
        String result = "";
        for (int x = -3; x <= 3; x++) { // calculates the y values
            int y = a * x * x + b * x + c;
            result += "x = " + x + ", y = " + y + "\n";
        }
        return result;
    }

    public String quadraticInformation() {
        String str = "";
        str += "The equation is: " + equation() + "\n";
        str += "The vertex for equation is: " + vertex() + "\n";
        str += "The y-intercept is: " + yIntercept() + "\n";
        str += "" + min() + ", " + max() + "\n";
        str += "Axis of symmetry is: " + axisOfSymmetry() + "\n";
        str += "The zeros are approximately: " + zeros() + "\n";
        str += "The y-values for x from -3 to 3 are: \n" + calculateYValues();
        return str; // returns a string of all the previous returned values
    }
}
