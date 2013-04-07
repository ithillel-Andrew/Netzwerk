
/* 
 * Class Documentation
 * Fields of user's features: name, surname, sex, age, e-mail, password ...
 */

package db;

//class user
public class User extends Base {
	
	private String surname;
	private String sex;
	private int age;
	private String email;	
	private String password;
	
	public User(String name, String surname, String sex, int age, String email, String password) {
		// TODO Auto-generated constructor stub
		this.setName(name);
		this.setSurname(surname);
		this.setSex(sex);
		this.setAge(age);
		this.setEmail(email);		
		this.setPass(password);
	}	

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPass() {
		return password;
	}

	public void setPass(String password) {
		this.password = password;
	}

}
