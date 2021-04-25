import java.util.GregorianCalendar;

public class _9_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GregorianCalendar calendar = new GregorianCalendar();
        System.out.println("显示当前的年月日: " + calendar.get(calendar.YEAR) + "." + calendar.get(calendar.MONTH) + "." + calendar.get(calendar.DAY_OF_MONTH));

        calendar.setTimeInMillis(1234567898765L);
        System.out.println("显示特定的年月日: " + calendar.get(calendar.YEAR) + "." + calendar.get(calendar.MONTH) + "." + calendar.get(calendar.DAY_OF_MONTH));
	}

}
