import java.util.GregorianCalendar;

public class _9_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GregorianCalendar calendar = new GregorianCalendar();
        System.out.println("��ʾ��ǰ��������: " + calendar.get(calendar.YEAR) + "." + calendar.get(calendar.MONTH) + "." + calendar.get(calendar.DAY_OF_MONTH));

        calendar.setTimeInMillis(1234567898765L);
        System.out.println("��ʾ�ض���������: " + calendar.get(calendar.YEAR) + "." + calendar.get(calendar.MONTH) + "." + calendar.get(calendar.DAY_OF_MONTH));
	}

}
