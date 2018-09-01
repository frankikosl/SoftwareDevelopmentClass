package menu.app;

import inout.In;
import inout.Out;
import menu.Menu;
import menu.MenuPlan;
import menu.Week;

public class MenuApp {
	
	public static void main(String[] args) {
		MenuPlan schedule = readSchedule("MenuSchedule.txt");
		int endeSchalter = 52;
		while (endeSchalter != 0) { //When 0 is input, program ends
			Out.println("-------------------------------------");
			Out.print("Nummer Woche eingeben (Ende mit 0): ");
			endeSchalter = In.readInt();
			if (endeSchalter < 53 && endeSchalter > 0) { //2018 only has 52 weeks
				schedule.printSchedule(endeSchalter);
			} else if (endeSchalter >= 53){
				Out.println("Ungültiges Nummer. 2018 hat nur 52 Wochen.");
			}
		} 
		Out.println("Ende");
	}

	private static MenuPlan readSchedule(String fn) {
		//So i decided to work with arrays. The program is organized like this:
		//A Menu object contains one specific Menu
		//A week object contains maximally 2 Menus for every day. It is a 2D array of Menus
		//The MenuPlan contains an array of weeks, 52 to be exact with our year
		MenuPlan schedule = new MenuPlan(); 
		In.open(fn);
		@SuppressWarnings("unused")
		char hash = In.read(); 
		while (In.done()) {
			int weekNr = In.readInt(); 
			Week week = new Week(weekNr); 
			do {
				int day = In.readInt(); 
				if (!In.done()) {
					break; 
				}
				int menuNr = In.readInt(); 
				String soup = In.readString(); 
				String mainCourse = In.readString(); 
				Menu menu = new Menu(mainCourse, soup, day, menuNr); //so here we create a new menu
				week.setMenu(menu); //add it to a week
				schedule.setWeekPlan(week); //and add this week to our Menu plan
			} while (In.done() && In.peek() != '#'); 
			hash = In.read();
		}
		In.close();
		return schedule; 
	}

}
