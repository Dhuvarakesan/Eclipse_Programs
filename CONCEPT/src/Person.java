/**
 * 
 */

/**
 * @author dhuvarakesan
 * 4-6-2023
 */
public class Person implements Comparable<Person> {
	String name;
	int id;
	public Person(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "]";
	}
	@Override
	public int compareTo(Person o) {
		return o.name.compareTo(name);
	}
	
}
