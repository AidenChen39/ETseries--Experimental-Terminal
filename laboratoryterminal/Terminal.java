package laboratoryterminal;
import java.util.Scanner;

import guessthenumber.*;


public class Terminal {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Aiden's Laboratory.");
		System.out.println("-".repeat(40));
		System.out.print("Enter Username: ");
		Scanner enter = new Scanner(System.in);
		
		while (enter.hasNext()) {
			String id = enter.next();
			User idNumber = new User(id);
			//idNumber.SetUser();
			switch(idNumber.Valid()) {
			case 1:
				System.out.printf("Constructor %s , Welcome to the Lab.", id);
				System.out.println("");
				System.out.println("-".repeat(40));
				MainCode();
				break;		
			case 2:
				System.out.printf("Username: %s , Welcome to the Lab.", id);
				System.out.println("");
				System.out.println("-".repeat(40));
				MainCode();
				break;
			case 3:
				System.out.printf("Use7rna-m2#0e: %s , Welco2me t1o t//he Lab.", id);
				System.out.println("");
				System.out.println("-".repeat(40));
				MainCode();
				break;
			default:
				System.out.println(String.format("Username: %s , unknown username", id));
				break;
			}
			System.out.print("Enter Username: ");
			
		}

	}
	
	public static void MainCode() {
		Scanner ent = new Scanner(System.in);
		System.out.print("Please enter your command: ");
		
		while(ent.hasNext()) {
			String com = ent.nextLine();
			Action command = new Action(com);
			command.Operate();
			System.out.println("-".repeat(40));
			System.out.print("Please enter tour command: ");
		}
	}

}
