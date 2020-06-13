package studentinfodata;

public class Studentinformation {
	int id;
	String name;
	int sub1,sub2,sub3;
	
	public Studentinformation(){
		
	}

	public Studentinformation(int id, String name, int sub1, int sub2, int sub3) {
		super();
		this.id = id;
		this.name = name;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSub1() {
		return sub1;
	}

	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}

	public int getSub2() {
		return sub2;
	}

	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}

	public int getSub3() {
		return sub3;
	}

	public void setSub3(int sub3) {
		this.sub3 = sub3;
	}
	double Percentage(){
		return (sub1+sub2+sub3)/3;
		
	}
	double total() {
		return (sub1+sub2+sub3);
	}

	@Override
	public String toString() {
		return "Studentinformation [id=" + id + ", name=" + name + ", sub1=" + sub1 + ", sub2=" + sub2 + ", sub3="
				+ sub3 + ", Percentage()=" + Percentage() + ", total()=" + total() + "]";
	}

	
	

}
