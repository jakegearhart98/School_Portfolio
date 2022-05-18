/* 
 * @author Jake Gearhart
 * @version 09/14/2021
 * Class used for student object
 */
public class Student extends UniversityMember {
	/*
	 * @param gpa: protected float for gpa
	 */
	protected float gpa;
	
	/*
	 * Constructor for Student object
	 */
	public Student(String name, int age, String idNumber, float gpa) {
		super(name, age, idNumber);
		this.gpa = gpa;
	}
	/*
	 * Returns gpa
	 */
	public float getGpa() {
		return gpa;
	}
	public void setGpa(float gpa) {
		this.gpa = gpa;
	}
	/*
	 * So equal objects have equal hashcodes
	 */
	@Override
	public int hashCode() {
		int hash = 7;
		hash = 31 * hash + super.hashCode();
		hash = 31 * hash + String.valueOf(gpa).hashCode();
		return hash;
	}
	/*
	 * Overrides and formats toString method
	 */
	@Override
	public String toString() {
		return super.toString() + " GPA: " + gpa;
	}
	/*
	 * Overrides equals method, adds different checks to see if objects are equal
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		if (!super.equals(obj)) return false;
		Student st = (Student) obj;
		return Double.valueOf(gpa).equals(Double.valueOf(st.gpa));
	}
}
