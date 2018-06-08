package com.javaex.api.utility.date;

import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {

		Calendar now = Calendar.getInstance();
		Calendar custom = Calendar.getInstance();
		custom.set(1972, 5, 24); //월은 0부터 시작 (=6월 24일)
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		int date = now.get(Calendar.DATE);
		
		System.out.printf("오늘은 %d년 %d월 %d일 \n", year, month, date);
		
		month = now.get(Calendar.MONTH) + 1;
		System.out.printf("오늘은 %d년 %d월 %d일 \n", year, month, date);
		
		Calendar future = Calendar.getInstance();
		future.add(Calendar.YEAR, 10);
		System.out.printf("future: %d년 %d월 %d일 \n", future.get(Calendar.YEAR), future.get(Calendar.MONTH)+1, future.get(Calendar.DATE));

		int dow = future.get(Calendar.DAY_OF_WEEK);
		System.out.println(dow);
		
		String dowStr;
		
		switch(dow) {
		case Calendar.SUNDAY:
			dowStr = "일요일";
			break;
		case Calendar.MONDAY:
			dowStr = "월요일";
			break;
		case Calendar.TUESDAY:
			dowStr = "화요일";
			break;
		case Calendar.WEDNESDAY:
			dowStr = "수요일";
			break;
		case Calendar.THURSDAY:
			dowStr = "목요일";
			break;
		case Calendar.FRIDAY:
			dowStr = "금요일";
			break;
		case Calendar.SATURDAY:
			dowStr = "토요일";
			break;
		default:
			dowStr = "?";
		}
		
		System.out.println(dowStr);
		
	}

}
