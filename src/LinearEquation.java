public class LinearEquation {

    // Instance Variables
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private String slope;

    // Constructor, initializing variables
    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    // Calculates the distance between the two points
    public double distance() {
        double x = Math.pow((x2 - x1), 2);
        double y = Math.pow((y2 - y1), 2);
        double d = Math.sqrt(x + y);
        return roundedToHundredth(d);
    }

    // Calculates and returns the slope of the line
    public double slope() {
        double m = ((double) y2 - y1) / (x2 - x1);
        String slope1 = (y2 - y1) + "/";
        String slope2 = (x2 - x1) + "";
        slope = slope1 + slope2;
        return roundedToHundredth(m);
    }

    // Calculates and returns the y-intercept of the line
    public double yIntercept() {
        double b = y1 - (slope() * x1);
        return roundedToHundredth(b);
    }

    // Calculates and returns the linear equation of the line that goes through given points
    public String equation() {
        if (y1 == y2) {
            return "y = " + y1;
        }
        double m = slope();  // 5/4 not 1.25, fix this later
        double b = yIntercept();
        return "y = " + slope + "x + " + b;
    }

    // Calculates and returns the y-coordinate on the line when given an x-coordinate
    public String coordinateForX(double x) {
        double y = roundedToHundredth(slope() * x + yIntercept());
        return "(" + x + ", " + y + ")";
    }

    // Returns a string composed of all the information about the lines and points
    public String lineInfo() {
        String str = "The two points are: (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ")";
        str += "\nThe equation of the line between these points is: " + equation();
        str += "\nThe slope of this line is: " + slope();
        str += "\nThe y-intercept of this line is: " + yIntercept();
        str += "\nThe distance between these points is: " + distance();
        return str;
    }

    private double roundedToHundredth(double toRound) {
        return Math.round(toRound * 100) / 100.0;
    }
}