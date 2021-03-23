import java.util.Scanner;

public class _3_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	    System.out.print("Enter a point's x- and y-coordinates: ");
	    
	    double x = input.nextDouble();
	    double y = input.nextDouble();

	    if (x < 200 && x > 0 && y < 100 && y > 0)
	    {
	    	if(-0.5 * x - y + 100 > 0)
	    		System.out.println("The point is in the triangle");
	    	else
	    	{
	    		System.out.println("The point is not in the triangle");
	    	}
	    }
	    	
	    else
	    	System.out.println("The point is not in the triangle");
	}

}
