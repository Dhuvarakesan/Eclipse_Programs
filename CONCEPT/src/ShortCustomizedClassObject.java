/**
 * 
 */
import java.util.Collections;
import java.util.HashMap;
/**
 * program to sort the map which is holding person details(sort the map by name)
 * @author dhuvarakesan
 * 4-6-2023
 */
class Person implements Comparable<Person>{
	String name;
	int id;
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
		return name.compareTo(o.name);
	}
	
}
public class ShortCustomizedClassObject {

	public static void main(String[] args) {
		HashMap <Integer,String> obj = new HashMap<>();
		obj.put(123,"xdhuvara");
		obj.put(123,"adhuvara");
		obj.put(123,"edhuvara");
		Collections.sort(com);
		
	}

}
