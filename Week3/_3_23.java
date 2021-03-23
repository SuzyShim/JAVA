import java.util.Scanner;

public class _3_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	    System.out.print("Enter a point with two coordinates:");
	    
	    double x = input.nextDouble();
	    double y = input.nextDouble();

	    if ((Math.abs(x) <= 5) && (Math.abs(y) <= 2.5))
	        System.out.println("Point (" + x + ", " + y + ") is in the rectangle");
	    else
	        System.out.println("Point (" + x + ", " + y + ") is not in the rectangle");
	}
}