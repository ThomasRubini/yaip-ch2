package ex3.part5;

public class MyDate {
	private static String[] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
	private static String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
	private static int[] DAYS_IN_MONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	// [1;x]
	private int year, month, day;

	public boolean isLeapYear(int year){
		if(year%4==0){
			if(year%100==0){
				if(year%400==0)return true;
				else return false;
			}else return true;
		}else return false;
	}

	private int maxDayInMonth(int year, int month){
		if(month==2&&isLeapYear(year))return 29;
		else return DAYS_IN_MONTHS[month-1];
	}

	public boolean isValidDate(int year, int month, int day){
		if(year<1||year>9999)return false;
		if(month<1||month>12)return false;
		if(day<1||day>maxDayInMonth(year, month))return false;
		return true;
	}

	// Taken from https://www3.ntu.edu.sg/home/ehchua/programming/java/J2a_BasicsExercises.html#dateutil
	public int getDayOfWeek(int year, int month, int day){
		int magicDayNumber = (year/100)%4;
		magicDayNumber = (3-magicDayNumber)*2;

		magicDayNumber += year%100;
		magicDayNumber += (year%100)/4;

		 int[] magicMonthTable = new int[]{0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
		if(isLeapYear(year)){
			magicMonthTable[0] = 6;
			magicMonthTable[1] = 2;
		}
		magicDayNumber += magicMonthTable[month-1];

		magicDayNumber += day;

		return magicDayNumber%7;
	}

	public MyDate(int year, int month, int day){
		setDate(year, month, day);
	}

	public void setDate(int year, int month, int day){
		if(isValidDate(year, month, day)){
			this.year = year;
			this.month = month;
			this.day = day;
		}else throw new IllegalArgumentException("Invalid year, month, or day!");
	}

	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	public void setYear(int year) {
		if(year < 1 || year > 9999){
			throw new IllegalArgumentException("Invalid year!");
		}else this.year = year;
	}

	public void setMonth(int month) {
		if(month < 1 || month > 12){
			throw new IllegalArgumentException("Invalid month!");
		}else this.month = month;
	}

	public void setDay(int day) {
		if(day < 1 || day > maxDayInMonth(year, month)) {
			throw new IllegalArgumentException("Invalid day!");
		}else this.day = day;
	}

	@Override
	public String toString() {
		return "%s %s %s %s".formatted(
				DAYS[getDayOfWeek(year, month, day)],
				day,
				MONTHS[month-1],
				year
		);
	}


	public MyDate nextDay(){
		if(day==maxDayInMonth(year, month)){
			day = 1;
			nextMonth();
		}else day++;

		return this;
	}


	public MyDate nextMonth(){
		if(month==12){
			month = 1;


			nextYear();
		}else month++;

		int a = maxDayInMonth(year, month);
		if(day>a)day = a;

		return this;
	}

	public MyDate nextYear(){
		if(year==9999)throw new IllegalArgumentException("Year out of range!");
		else year++;

		int a = maxDayInMonth(year, month);
		if(day>a)day = a;

		return this;
	}

	public MyDate previousDay(){
		if(day==1){
			previousMonth();
			day = maxDayInMonth(year, month);
		}else day--;

		return this;
	}

	public MyDate previousMonth(){
		if(month==1){
			previousYear();
			month = 12;
		}else month--;

		int a = maxDayInMonth(year, month);
		if(day>a)day = a;

		return this;
	}

	public MyDate previousYear(){
		if(year==1)throw new IllegalArgumentException("Year out of range!");
		else year--;

		int a = maxDayInMonth(year, month);
		if(day>a)day = a;

		return this;
	}

}