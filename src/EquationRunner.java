import java.util.Scanner;


public class EquationRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your first coordinate: ");
        String coord1 = scan.nextLine();
        System.out.print("Enter your second coordinate: ");
        String coord2 = scan.nextLine();

        LinearEquation line1 = new LinearEquation(coord1, coord2);

        System.out.println(line1);

        System.out.print("Enter a third x-value: ");
        double x = scan.nextDouble();
        scan.nextLine();
        System.out.println("Solved coordinate point is: (" + x + "," + line1.solve(x) + ")");
    }
}
