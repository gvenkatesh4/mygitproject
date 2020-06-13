package project;

public class Data {
	private int id;
	private String name;
	private int sub1;
	
	private int sub2;
	private int sub3;
	private int sub4;
	
	
	public Data() {
		
	}
public Data(int id,String name,int sub1,int sub2,int sub3,int sub4) {
	this.id=id;
	this.name=name;
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
	return name;
}
protected void setName(String name) {
	this.name = name;
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
protected int getSub4() {
	return sub4;
}
protected void setSub4(int sub4) {
	this.sub4 = sub4;
}
@Override
public String toString() {
	return "Data [id=" + id + ", name=" + name + ", sub1=" + sub1 + ", sub2=" + sub2 + ", sub3=" + sub3 + ", sub4="
			+ sub4 + "]";
}


}
