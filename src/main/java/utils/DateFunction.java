package utils;


import org.joda.time.DateTime;

public class DateFunction {


	DateTime now = new DateTime();
	/*System.out.println("Current Day: " + now.dayOfWeek().getAsText());
	System.out.println("Current Month: " + now.monthOfYear().getAsText());
	System.out.println("Current Year: " + now.year().getAsText());
	System.out.println("Current Year is Leap Year: " + now.year().isLeap());*/
	String month= now.monthOfYear().getAsText();
	int day = now.getDayOfMonth();
	int min=now.getHourOfDay();
	int second = now.getMinuteOfHour();
	
	
	public String  customized_time(){
		String time_curr =month+"-"+day+" :"+min+":"+second;
		return time_curr;
	}
	public String  customized_Date(){
		String time_date =month+"-"+day;
		return time_date;
	}

}
