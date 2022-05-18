/* 
 * @author Jake Gearhart
 * @version 09/14/2021
 * Class used for Professor object
 */
public class Professor extends UniversityMember {
	/*
	 * @param officeLocation: protected string for location of office
	 */
	protected String officeLocation;
	
	/*
	 * Constructor for Professor object
	 */
	public Professor(String name, int age, String idNumber, String officeLocation) {
		super(name, age, idNumber);
		this.officeLocation = officeLocation;
	}
	/*
	 * return officeLocation
	 */
	public String getOfficeLocation() {
		return officeLocation;
	}
	public void setOfficeLocation(String officeLocation) {
		this.officeLocation = officeLocation;
	}
	/*
	 * So equal objects have equal hashcodes
	 */
	@Override
	public int hashCode() {
		int hash = 7;
		hash = 31 * hash + super.hashCode();
		hash = 31 * hash + officeLocation.hashCode();
		return hash;
	}
	/*
	 * Overrides and formats toString method
	 */
	@Override
	public String toString() {
		return super.toString() + " Office Location: " + officeLocation;
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
		Professor prof = (Professor) obj;
		return officeLocation.equals(prof.officeLocation);
	}
}
