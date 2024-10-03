import java.util.Scanner;


public class EquationRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your first coordinate: ");
        String coord1 = scan.nextLine();
        System.out.print("Enter your second coordinate: ");
        String coord2 = scan.nextLine();


        LinearEquation line1 = new LinearEquation(coord1, coord2);
        System.out.println("First pair: " + line1.getCoord1());
        System.out.println("Second pair: " + line1.getCoord2());
        System.out.println("Slope of line: " + line1.getSlope());
        System.out.println("Y-intercept: " + line1.getYIntercept());
        System.out.println("Slope intercept form: " + "y = " + line1.getSlope() + "x + " + line1.getYIntercept());
        System.out.println("Distance between points: " + line1.getDistance());
        System.out.print("Enter a third x-value: ");
        double x = scan.nextDouble();
        scan.nextLine();
        System.out.println("Solved coordinate point is: (" + x + "," + line1.solve(x) + ")");
    }
}
