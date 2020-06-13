package Studentdetailsusingcsv;

public class Student {
	private int id;
	private String Name;
	private int year;
	private int marks;
	
	private static int idgenerator=100;
	
	public Student() {
		
	}
	public Student(String Name,int year,int marks) {
		id=idgenerator++;
		this.Name=Name;
		this.year=year;
		this.marks=marks;
		
	}
	protected int getId() {
		return id;
	}
	protected void setId(int id) {
		this.id = id;
	}
	protected String getName() {
		return Name;
	}
	protected void setName(String name) {
		Name = name;
	}
	protected int getYear() {
		return year;
	}
	protected void setYear(int year) {
		this.year = year;
	}
	protected int getMarks() {
		return marks;
	}
	protected void setMarks(int marks) {
		this.marks = marks;
	}
	protected static int getIdgenerator() {
		return idgenerator;
	}
	protected static void setIdgenerator(int idgenerator) {
		Student.idgenerator = idgenerator;
	}
	@Override
	public String toString(){
		return id+","+Name+","+year+","+marks+"\n";
	}
	

}
