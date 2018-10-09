import java.awt.List;
import java.util.ArrayList;
import java.util.Calendar;

public class MenorsEdat {

	public static void main(String[] args) {
		
		ArrayList<String> persones = new ArrayList<String>();
		
		persones.add("Albert");
		persones.add("Jonathan");
		persones.add("Alba");
		persones.add("Oscar");
		persones.add("Karen");
		persones.add("Jenifer");
		
		for (String elements: persones) {
			System.out.println(elements);
		}
		
		
		Calendar birthDate = Calendar.getInstance();
		birthDate.set(2014, 1, 2);
		Person person1 = new Person(birthDate, "Albert");
		
		Calendar birthDate2 = Calendar.getInstance();
		birthDate2.set(1987, 2, 4);
		Person person2 = new Person(birthDate, "Marta");
		
		Calendar birthDate3 = Calendar.getInstance();
		birthDate3.set(1988, 5, 8);
		Person person3 = new Person(birthDate, "Alba");
		
		
		ArrayList<Person> persona = new ArrayList<Person>();
		persona.add(person1);
		persona.add(person2);
		persona.add(person3);
		
		for (Person elements: persona) {
			System.out.println(elements.toString());
		}
		
		
		

	}

}
