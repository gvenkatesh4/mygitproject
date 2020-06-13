package studata;

public class Student {
	private int id;
	private String Name;
	private int sub1;
	private int sub2;
	private int sub3;
	
	public Student() {
		
	}
public Student(int id,String Name,int sub1,int sub2,int sub3) {
	this.id=id;
	this.Name=Name;
	this.sub1=sub1;
	this.sub2=sub2;
	this.sub3=sub3;
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
protected int getSub1() {
	return sub1;
}
protected void setSub1(int sub1) {
	this.sub1 = sub1;
}
protected int getSub2() {
	return sub2;
}
protected void setSub2(int sub2) {
	this.sub2 = sub2;
}
protected int getSub3() {
	return sub3;
}
protected void setSub3(int sub3) {
	this.sub3 = sub3;
}
@Override
public String toString() {
	return "Student [id=" + id + ", Name=" + Name + ", sub1=" + sub1 + ", sub2=" + sub2 + ", sub3=" + sub3 + "]";
}



}
