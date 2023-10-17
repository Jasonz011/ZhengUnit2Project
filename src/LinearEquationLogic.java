import java.util.Scanner;
public class LinearEquationLogic {
    public void start() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the linear equation calculator!");
        System.out.print("Enter coordinate 1: ");
        String firstCoord = scan.nextLine();
        System.out.print("Enter coordinate 2: ");
        String secondCoord = scan.nextLine();
        System.out.println();
        String answer = "y";
        while (!answer.equals("n")) {
            int x1 = Integer.parseInt(firstCoord.substring(1, firstCoord.indexOf(",")));
            int y1 = Integer.parseInt(firstCoord.substring(firstCoord.indexOf(",") + 2, firstCoord.indexOf(")")));
            int x2 = Integer.parseInt(secondCoord.substring(1, secondCoord.indexOf(",")));
            int y2 = Integer.parseInt(secondCoord.substring(secondCoord.indexOf(",") + 2, secondCoord.indexOf(")")));
            LinearEquation equation = new LinearEquation(x1, y1, x2, y2);
            System.out.println(equation.lineInfo());
            System.out.println();
            System.out.print("Enter a value for x: ");
            double testX = scan.nextDouble();
            System.out.println("The point on the line is : " + equation.coordinateForX(testX));
            System.out.println();
            System.out.print("Would you like to enter another pair of coordinates? y/n: ");
            answer = scan.nextLine();
        }
        System.out.println("Thank you for using the slope calculator, goodbye!");
    }
}