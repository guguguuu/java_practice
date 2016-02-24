import java.util.*;

public class GregorianClendar{

public static void main(String[] args){
	GregorianCalendar gregorian = new GregorianCalendar();
	int hour = gregorian.get(Calendar.HOUR_OF_DAY);
	String greeting = "Good";
	
	switch(hour){
		case(1):
		case(2):
		case(3):
		case(4):{
			greeting += "Sunday";
			break;
	}
	default:{
	
			greeting += "iSunday"+"kkk";
			break;
	}

}
	System.out.println(greeting+"123123123");
}
}
