package chivagiovanni2019;

public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date() {	}
	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date mybirthday = new Date();
		
		mybirthday.day = 10;
		mybirthday.month = 03;
		mybirthday.year = 1993;
		
		System.out.println(mybirthday.day+"/"+mybirthday.month+"/"+mybirthday.year);
	}

}
