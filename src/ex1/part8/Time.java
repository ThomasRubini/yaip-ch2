package ex1.part8;

public class Time {
	private int hour, minute, second;

	public Time(int hour, int minute, int second) {
		setTime(hour, minute, second);
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

	public void setHour(int hour) {
		this.hour = hour;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}


	public void setSecond(int second) {
		this.second = second;
	}

	public void setTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	@Override
	public String toString() {
		return "%02d:%02d:%02d".formatted(hour, minute, second);
	}

	public Time nextSecond() {
		if (second >= 59) {
			second = 0;
			if (minute >= 59) {
				minute = 0;
				if (hour >= 23) {
					hour = 0;
				} else hour++;
			} else minute++;
		} else second++;

		return this;
	}

	public Time previousSecond() {
		if (second == 0) {
			second = 59;
			if (minute == 0) {
				minute = 59;
				if (hour == 0) {
					hour = 23;
				} else hour--;
			} else minute--;
		} else second--;
		return this;
	}


}
