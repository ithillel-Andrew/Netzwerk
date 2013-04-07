
/* 
 * Class Documentation
 * Base class of Data Base level
 * Fiels id - identity code of users and groups
 * Field name - uses like Username, or Group name...
 */

package db;

//class Base
public class Base {
	
	protected int id;
	protected String name;

	public int getId() {
		return id;
	}

	public void setName(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
