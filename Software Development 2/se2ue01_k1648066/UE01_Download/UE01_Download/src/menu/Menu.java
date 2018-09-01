package menu;

import inout.Out;

public final class Menu {

	private String mainCourse;
	private String soup;
	private Day day;
	private int menuNr;
	
	public Menu(String mainCourse, String soup, int day, int menuNr) {
		super(); //this came automatically with the constructor, decided not to mess with it
		this.mainCourse = mainCourse;
		this.soup = soup;
		switch (day) {
		case 0:
			this.day = Day.Montag;
			break;
		case 1:
			this.day = Day.Dienstag;
			break;
		case 2:
			this.day = Day.Mittwoch;
			break;
		case 3:
			this.day = Day.Donnerstag;
			break;
		case 4:
			this.day = Day.Freitag;
			break;
		}
		this.menuNr = menuNr;
	}
	
    String  getMainCourse() {
		return mainCourse;
	}
	void setMainCourse(String mainCourse) {
		this.mainCourse = mainCourse;
	}
	String getSoup() {
		return soup;
	}
	void setSoup(String soup) {
		this.soup = soup;
	}

	int getMenuNr() {
		return menuNr;
	}
	void setMenuNr(int menuNr) {
		this.menuNr = menuNr;
	}

	Day getDay() {
		return day;
	}
	
	int getDayNumber() {
		int dayNum = 0;
		switch (this.day) {
		case Montag:
			dayNum = 0;
			break;
		case Dienstag:
			dayNum = 1;
			break;
		case Mittwoch:
			dayNum = 2;
			break;
		case Donnerstag:
			dayNum = 3;
			break;
		case Freitag:
			dayNum = 4;
			break;
		}
		return dayNum;
	}

	void setDay(Day day) {
		this.day = day;
	}
	
}
