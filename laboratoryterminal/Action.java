package laboratoryterminal;

import guessthenumber.*;

public class Action {
	private String WORD;
	
	public Action(String a) {
		this.WORD = a;
	}
	
	public void Operate() {
		if(WORD.equals("log out")) {
			LogOut();
		}else if(WORD.equals("guess number")) {
			GuessTheNumber();
		}else {
			System.out.println("Unknown command. Please enter a valid command.");
		}
	}
	
	public static void GuessTheNumber() {
		System.out.println("-".repeat(40));
		guessthenumber.MainCode.main(null);
	}
	
	public static void LogOut() {
		System.out.println("Log out.");
		System.out.println("-".repeat(40));
		System.exit(0);
	}
	

}
