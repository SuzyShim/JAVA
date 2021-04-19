
public class TestCircleWithStaticMembers {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        System.out.println("Before creating objects");
        System.out.println("The numbers of Circle objects is " + CircleWithStaticMembers.numberOfObjects);

        // Create C1
        CircleWithStaticMembers c1 = new CircleWithStaticMembers();
        
        //Display c1 BEFORE c2 is created
        System.out.println("After creating c1");
        System.out.println("c1: radius (" + c1.radius + ") and numbers of Circle objects (" + c1.numberOfObjects + ")");

        // Create c2
        CircleWithStaticMembers c2 = new CircleWithStaticMembers(5);
        
        // Modify c1
        c1.radius = 9;
        
        // Display c1 and c2 AFTER c2 was created
        System.out.println("After creating c2 and modifying c1");
        System.out.println("c1: radius (" + c1.radius + ") and number of Circle objects (" + c1.numberOfObjects + ")");
        System.out.println("c2: radius (" + c2.radius + ") and number of Circle objects (" + c2.numberOfObjects + ")");
    }
}
