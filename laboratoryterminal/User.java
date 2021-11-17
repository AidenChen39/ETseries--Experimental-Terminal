package laboratoryterminal;

public class User {

	private String ENTER;
	private String[] FATHER = new String[1];
	private String[] USER = new String[2];
	private String[] HACKER = new String[2];
	
	public void SetUser() {
		
	}
	
	public User(String a) {
		ENTER = a;
		FATHER[0] = "Aiden";
		USER[0] = "Paff";
		USER[1] = "Neko";
		HACKER[0] = "Vanessa";
		HACKER[1] = "Iris";
	}
	
	public String GetUser() {
		return ENTER;
	}
	
	public int Valid() {
		int result = 0;
		if(ENTER.equals(FATHER[0]) == true) {
			result = 1;
		}
		for (int i = 0; i < 2; i++) {
			if(ENTER.equals(USER[i]) == true) {
				result = 2;
			} else if(ENTER.equals(HACKER[i]) == true) {
				result = 3;
			} 
		}
		return result;
	}
	

}
