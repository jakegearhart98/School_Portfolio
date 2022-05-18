/* 
 * @author Jake Gearhart
 * @version 09/14/2021
 * Class used for person object
 */
public class Person {
	 /*
	  * @param name: protected string for name of person
	  * @param age: protected int for age of person
	  */
	protected String name;
	protected int age;
	
	/*
	 * Constructor for Person object
	 */
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	/*
	 * returns name
	 */
	public String getName() {
		return name;
	}
	/*
	 * returns age
	 */
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	/*
	 * Overrides and formats toString method
	 */
	@Override
	public String toString() {
		return "Name: " + name + " Age: " + age;
	}
	/*
	 * Overrides equals method, adds different checks to see if objects are equal
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false; //.getClass() looks if class is the same
		Person p = (Person) obj; //called casting object, use to resolve class cast exception
		return age == p.age && name.equals(p.name);
	}
	
	@Override
	/*
	 * So equal objects have equal hashcodes
	 */
	public int hashCode() {
		int hash = 7;
		hash = 31 * hash + age;
		hash = 31 * hash + name.hashCode();
		return hash;
	}
}
