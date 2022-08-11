package by.mike.tr.main;

public class Time {
	private int hours;
	private int minutes;
	private int seconds;
	private int maxHours = 24;
	private int maxMinutes = 60;
	private int maxSeconds = 60;

	public Time() {
		hours = 0;
		minutes = 0;
		seconds = 0;
	}

	public Time(int hours, int minutes, int seconds) {
		if ((hours > maxHours) || ((hours == maxHours) && (minutes > 0 || seconds > 0))) {
			System.out.println("Time is more than the 24 hours ");
			this.hours = 0;
			this.minutes = 0;
			this.seconds = 0;

		} else if ((minutes >= maxMinutes) | (seconds >= maxSeconds) | (hours < 0) | (minutes < 0) | (seconds < 0)) {
			System.out.println("Wrong time format ");
			this.hours = 0;
			this.minutes = 0;
			this.seconds = 0;
		} else {
			this.hours = hours;
			this.minutes = minutes;
			this.seconds = seconds;

		}

	}

	public void add(int secondsAdd) {
		int k = 0;
		seconds = seconds + secondsAdd;
		while (seconds >= maxSeconds) {
			seconds = seconds - maxSeconds;
			k++;
		}
		minutes = minutes + k;
		k = 0;
		while (minutes >= maxMinutes) {
			minutes = minutes - maxMinutes;
			k++;
		}

		hours = hours + k;
		if ((hours > maxHours) || ((hours == maxHours) && (minutes > 0 || seconds > 0))) {
			System.out.println("Time is more than the 24 hours ");
			hours = hours - maxHours;
		}

	}

	public void add(int minutesAdd, int secondsAdd) {
		int k = 0;
		seconds = seconds + secondsAdd;
		while (seconds >= maxSeconds) {
			seconds = seconds - maxSeconds;
			k++;
		}
		minutes = minutes + k + minutesAdd;
		k = 0;
		while (minutes >= maxMinutes) {
			minutes = minutes - maxMinutes;
			k++;
		}
		hours = hours + k;
		if ((hours > maxHours) || ((hours == maxHours) && (minutes > 0 || seconds > 0))) {
			System.out.println("Time is more than the 24 hours ");
			hours = hours - maxHours;
		}

	}

	public void add(int hoursAdd, int minutesAdd, int secondsAdd) {
		int k = 0;
		seconds = seconds + secondsAdd;
		while (seconds >= maxSeconds) {
			seconds = seconds - maxSeconds;
			k++;
		}
		minutes = minutes + k + minutesAdd;
		k = 0;
		while (minutes >= maxMinutes) {
			minutes = minutes - maxMinutes;
			k++;
		}
		hours = hours + k + hoursAdd;
		if ((hours > maxHours) || ((hours == maxHours) && (minutes > 0 || seconds > 0))) {
			System.out.println("Time is more than the 24 hours ");
			hours = hours - maxHours;
		}

	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		if ((hours > maxHours) || ((hours == maxHours) && (minutes > 0 || seconds > 0))) {
			System.out.println("Time is more than the 24 hours ");
			this.hours = 0;
		} else {

			this.hours = hours;
		}
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		if (minutes >= maxMinutes) {
			System.out.println("Wrong time format ");
			this.minutes = 0;
		} else {
			this.minutes = minutes;

		}

	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		if (seconds >= maxSeconds) {
			System.out.println("Wrong time format ");
			this.seconds = 0;
		} else {
			this.seconds = seconds;

		}

	}

}
