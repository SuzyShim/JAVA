
public class CircleWithStaticMembers {
	/** The radius of the circle */
	double radius;

    /** The number of objects created */
	static int numberOfObjects = 0;
    
	/** Construct a circle with radius 1 */
	CircleWithStaticMembers(){
	    radius = 1;
	    numberOfObjects++;
	}
	
	CircleWithStaticMembers(double newRadius){
	    radius = newRadius;
	    numberOfObjects++;
	}
	    
	static int getNumberOfObjects(){
	    return numberOfObjects;
	}

	double getArea(){
	    return radius * radius * Math.PI;
	}

}
