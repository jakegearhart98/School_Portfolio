/* 
 * @author Jake Gearhart
 * @version 09/14/2021
 * Driver for Person, UniversityMember, Student, and Professor classes
 */
public class PersonDriver {
	public static void main(String[] args) {
		Person p1 = new Person("Jake", 22);
		UniversityMember um1 = new UniversityMember("Nick", 21, "48354");
		Student st1 = new Student("Ani", 18, "8768567", 3.94f);
		Professor pro1 = new Professor("Mr.John", 59, "123553", "Upstairs B002");
		Student st2 = new Student("James", 45, "789598", 2.64f);
		Person[] people = {um1, st1, p1, pro1, st2};
		
		for (int i = 0; i < people.length; i++) {
			System.out.println(people[i]);
		}
		System.out.println("Hashecodes: " + um1.hashCode() + " " +  st1.hashCode() + " " + p1.hashCode() + " " + pro1.hashCode() + " " + st2.hashCode());
		System.out.println(um1.equals(st1));
		System.out.println(st1.equals(pro1));
		System.out.println(st1.equals(st1));
		System.out.println(st2.equals(st1));
	}
}
