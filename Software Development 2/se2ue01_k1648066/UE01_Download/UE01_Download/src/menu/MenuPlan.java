package menu;

import inout.Out;

public final class MenuPlan {
	private Week[] menuPlan = new Week[53];
	
	public void printSchedule(int week) {
		//print schedule will iterate through the menus in the given week and then print them, basically
		if (menuPlan[week] == null) {
			Out.println("Kein Wocheplan für Woche " + week + " vorhanden");
		}
		else {
			Out.println("Woche " + menuPlan[week].getWeekNumber() + ", 2018: ");
			for (int i = 0; i < 5; i++) {
				if (menuPlan[week].getWeekPlan(0, i) == null && menuPlan[week].getWeekPlan(1, i) != null ){
					Out.println(menuPlan[week].getWeekPlan(1, i).getDay() + ":");
				}
				else if(menuPlan[week].getWeekPlan(1, i) == null && menuPlan[week].getWeekPlan(0, i) != null){
					Out.println(menuPlan[week].getWeekPlan(0, i).getDay() + ":");
				}
				else if(menuPlan[week].getWeekPlan(1, i) != null && menuPlan[week].getWeekPlan(0, i) != null){
					Out.println(menuPlan[week].getWeekPlan(1, i).getDay() + ":"); 
					//if both aren't null, any of them works
				}
				
				for (int j = 0; j < 2; j++) {
					if (menuPlan[week].getWeekPlan(j, i) == null) {
						
					}
					else {
						Out.print("	Menu " + menuPlan[week].getWeekPlan(j, i).getMenuNr() + ": ");
						Out.println(menuPlan[week].getWeekPlan(j, i).getSoup());
						Out.println("	        " + menuPlan[week].getWeekPlan(j, i).getMainCourse());
					}

				}
			}
		}
	}



	public Week[] getWeekPlan() {
		return menuPlan;
	}



	public void setWeekPlan(Week weekPlan) {
		this.menuPlan[weekPlan.getWeekNumber()] = weekPlan;
	}
}
