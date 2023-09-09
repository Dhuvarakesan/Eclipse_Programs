import java.util.ArrayList;
import java.util.Collections;

/**
 * program to sort array list which has user defined class object
 * @author dhuvarakesan
 * 4-6-2023
 */
public class SortListOfCustomClassObject {
	public static void main(String[] args) {
		ArrayList<Person> obj = new ArrayList<>();
		obj.add(new Person("xdhuvara",123));
		obj.add(new Person("adhuvara",213));
		obj.add(new Person("vdhuvara",23));
		Collections.sort(obj);
		System.out.println(obj.toString());
	}

}
