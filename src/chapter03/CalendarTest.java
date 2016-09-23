package chapter03;

import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance(); //Calendar는 추상클래스라 메소드 (팩토리 리턴)
		printDate(calendar);
		
//		calendar.set(Calendar.YEAR, 2007);
//		calendar.set(Calendar.MONTH, 10);
//		calendar.set(Calendar.DATE, 18);

		calendar.set(1988, 12, 30);
		calendar.add(Calendar.DATE, 10098);
		printDate(calendar);
		
		calendar = Calendar.getInstance();
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
		
	}
	
	public static void printDate(Calendar calendar){
		
		 String[] days = {" ","일","월","화","수","목","금","토"};
		 int year = calendar.get(Calendar.YEAR); //0-11
		 int month = calendar.get(Calendar.MONTH);
		 int date = calendar.get(Calendar.DATE);
		 int hour = calendar.get(Calendar.HOUR);
		 int min = calendar.get(Calendar.MINUTE);
		 int second = calendar.get(Calendar.SECOND);
		 
		 int day = calendar.get(Calendar.DAY_OF_WEEK);	//1(일)-7(토) 
		 
		 System.out.println(year + "년 " + 
				 			(month+1) + "월 " +
				 			date + "일 " +
				 			days[day-1] + "요일 " +
				 			hour + "시 "  +
				 			min + "분 "   +
				 			second + "초 " 
				 );
	}
}
