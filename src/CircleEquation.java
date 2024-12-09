public class CircleEquation {
    // Instance Variables
    private int radius;
    private int x1;
    private int y1;
    // Constructors
    public CircleEquation(int radius, int x1, int y1) {
        this.radius = radius;
        this.x1 = x1;
        this.y1 = y1;
    }
    // Private Helper Methods
    private double roundToHundredth(double value) {
        return Math.round(value * 100) / 100.0;
    }
    // Other Public Methods
    public double diameter() {
        return radius * 2.0; // returns the radius
    }

    public double circumference() {
        return 2 * Math.PI * radius; // returns the circumference
    }

    public double area() {
        return Math.PI * Math.pow(radius, 2); // returns the area
    }

    public String circleEquation() {
        return "(x - " + x1 + ")^2 + (y - " + y1 + ")^2 = " + (radius * radius); // returns the equation of the circle
    }

    public String circleInformation() {
        String str = "";
        str += "The equation for the circle is " + circleEquation() + "\n";
        str += "The radius is " + radius + " and the center is " + "(" + x1 + ", " + y1 + " )" + "\n";
        str += "The diameter of this circle is: " + diameter() + "\n";
        str += "The area of this circle is approximately: " + roundToHundredth(area()) + "\n";
        str += "The circumference of this circle is approximately:" + roundToHundredth(circumference()) + "\n";
        return str; // returns a string comprised of all the previous returned values
    }
}
