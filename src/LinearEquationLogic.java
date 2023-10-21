import java.util.Scanner;
public class LinearEquationLogic {

    // variables that are used by the program
    private Scanner scan;
    private LinearEquation equation;
    int x1;
    int x2;
    int y1;
    int y2;

    // method starts the program
    public void start() {
        scan = new Scanner(System.in);
        System.out.println("Welcome to the linear equation calculator!");
        info();
    }

    // private helper method that prints information, also asks user for x
    public void info() {
        String answer = "y";
        while (!answer.equals("n")) {
            getCoordinates();
            if (x1 != x2) {
                equation = new LinearEquation(x1, y1, x2, y2);
                System.out.println(equation.lineInfo());
                System.out.println();
                System.out.print("Enter a value for x: ");
                double testX = scan.nextDouble();
                scan.nextLine();
                System.out.println("The point on the line is : " + equation.coordinateForX(testX));
                System.out.println();
                System.out.print("Would you like to enter another pair of coordinates? y/n: ");
                answer = scan.nextLine();
            } else {
                System.out.println("These points are on a vertical line: x = " + x1);
                System.out.print("Would you like to enter another pair of coordinates? y/n: ");
                answer = scan.nextLine();
            }
        }
        System.out.println("Thank you for using the slope calculator, goodbye!");
    }

    // private helper method that gets the coordinates and records the points
    private void getCoordinates() {
        System.out.print("Enter coordinate 1: ");
        String firstCoord = scan.nextLine();
        System.out.print("Enter coordinate 2: ");
        String secondCoord = scan.nextLine();
        System.out.println();
        x1 = Integer.parseInt(firstCoord.substring(1, firstCoord.indexOf(",")));
        y1 = Integer.parseInt(firstCoord.substring(firstCoord.indexOf(",") + 2, firstCoord.indexOf(")")));
        x2 = Integer.parseInt(secondCoord.substring(1, secondCoord.indexOf(",")));
        y2 = Integer.parseInt(secondCoord.substring(secondCoord.indexOf(",") + 2, secondCoord.indexOf(")")));
    }
}