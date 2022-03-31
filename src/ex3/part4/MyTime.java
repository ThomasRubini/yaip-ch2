package ex3.part4;

public class MyTime {
	private int hour, minute, second;

	public MyTime(){
		this(0, 0, 0);
	}

	public MyTime(int hour, int minute, int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

	private void validate(int n, int upperBound){
		if(n<0||n>upperBound)throw new IllegalArgumentException("Invalid hour, minute, or second!");
	}

	public void setHour(int hour) {
		validate(hour, 23);
		this.hour = hour;
	}

	public void setMinute(int minute) {
		validate(minute, 59);
		this.minute = minute;
	}

	public void setSecond(int second) {
		validate(second, 59);
		this.second = second;
	}

	@Override
	public String toString() {
		return "%02d:%02d:%02d".formatted(hour, minute, second);
	}

	public MyTime nextSecond(){
		if(second==59){
			nextMinute();
			second = 0;
		}else second++;
		return this;
	}

	public MyTime nextMinute(){
		if(minute==59){
			nextHour();
			minute = 0;
		}else minute++;
		return this;
	}

	public MyTime nextHour(){
		if(hour==23)hour = 0;
		else hour++;
		return this;
	}

	public MyTime previousSecond(){
		if(second==0){
			previousMinute();
			second = 59;
		}else second--;
		return this;
	}

	public MyTime previousMinute(){
		if(minute==0){
			previousHour();
			minute = 59;
		}else minute--;
		return this;
	}

	public MyTime previousHour(){
		if(hour==0)hour = 23;
		else hour--;
		return this;
	}
}
