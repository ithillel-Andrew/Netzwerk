
/* 
 * Class Documentation
 * Work with users
 * create() - create list for the save data
 * add() - add new user to the list (registration)
 * entry() - entry to network
 * getListName() - read all users in the base (future - look at the friends)
 * checkRegister() - check of registration
 */

package version2;
import java.util.*;

//class work with profile
public class Profile {
	
	private ArrayList<User> users;

	public void create() {
		users = new ArrayList<User>();		
	}
	
	public void add(User user) {
		users.add(user); 
	}
	
	public String entry(String surname) {		
		String entryName = "";
		String entrySurname = "";
		String entrySex = "";
		int entryAge = 0;
		String entryEmail = "";
		String result = "";	
		for (int i = 0; i < users.size(); i++) {					
			if (surname == users.get(i).surname) {
				entryName = users.get(i).name;
				entrySurname = users.get(i).surname;
				entrySex = users.get(i).sex;
				entryAge = users.get(i).age;
				entryEmail = users.get(i).email;
				result = "Name: " + entryName + "\n" + "Surname: " + entrySurname + "\n" + "Sex: " + entrySex + "\n" + "Age: " + entryAge + "\n" + "E-mail: " + entryEmail;
				break;
			}				
		}
		return result;
	}
	
	public String getListName() {
		String allNames = null;
		for (int i = 0; i < users.size(); i++) {
			allNames += " " + users.get(i).name + "\n";
		}
		allNames = allNames.substring(4);
		return allNames;
	}
	
	public int checkRegister(String surname) {
		String accum = "";
		for (int i = 0; i < users.size(); i++) {
			accum += " " + users.get(i).surname;			
		}
		int checkNames = accum.indexOf(surname);
		return checkNames;
	}

}
