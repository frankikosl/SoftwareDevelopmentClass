package menu;

public final class Week { //this is a pretty basic class. Just constructors and getters and setters
	private Menu[][] weekPlan = new Menu[2][5];
	private int weekNumber;
	
	public Week(int weekNumber){
		this.weekNumber = weekNumber;
	}
	
	public final void setMenu(Menu menu) {
		this.weekPlan[menu.getMenuNr()][menu.getDayNumber()] = menu;

	}

	public final Menu getWeekPlan(int j, int i) {
		return weekPlan[j][i];
	}

	public final void setWeekPlan(Menu[][] weekPlan) {
		this.weekPlan = weekPlan;
	}

	public final int getWeekNumber() {
		return weekNumber;
	}

	public final void setWeekNumber(int weekNumber) {
		this.weekNumber = weekNumber;
	}
}
