public class Student {
	
	private int id;
	private String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "Name: " + name + "\tID: " + id;
	}

	public static void main(String[] args) {
		Student [] section = new Student[4];
		section[0] = new Student(234, "Bob");
		section[1] = new Student(471, "Jill");
		section[2] = new Student(561, "Jan");
		section[3] = new Student(147, "Bill");
		for (int i=0; i<section.length; i++)
			System.out.println(section[i]);
	}
}