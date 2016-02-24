import java.util.*;

public class CalendarDemo {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();

		System.out.println("Calendar's Year: " + cal.get(Calendar.YEAR));
		System.out.println("Calendar's Month: " + cal.get(Calendar.MONTH));
		System.out.println("Calendar's Day: " + cal.get(Calendar.DATE));
	}
}
