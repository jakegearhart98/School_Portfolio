/* 
 * @author Jake Gearhart
 * @version 09/14/2021
 * Class used for University Member object
 */
public class UniversityMember extends Person{
	/*
	 * @param idNumber: protected string for id number
	 */
	protected String idNumber;
	
	/*
	 * Constructor for UniversityMember object
	 */
	public UniversityMember(String name, int age, String idNumber) {
		super(name, age);
		this.idNumber = idNumber;
	}
	/*
	 * Returns idNumber
	 */
	public String getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	/*
	 * So equal objects have equal hashcodes
	 */
	@Override
	public int hashCode() {
		int hash = 7;
		hash = 31 * hash + super.hashCode();
		hash = 31 * hash + idNumber.hashCode();
		return hash;
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
		UniversityMember um = (UniversityMember) obj;
		return idNumber.equals(um.idNumber);
	}
	/*
	 * Overrides and formats toString method
	 */
	@Override
	public String toString() {
		return super.toString() + " IdNumber: " + idNumber;
	}
	
	
}
