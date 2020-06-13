package abc;



	public class Student implements Comparable<Student> {

	private String name;
	private int  id;
	private int phy ;

	private int che;
	private int maths;

	Student(){

	}
	public Student( int id,String name,int phy,int che,int maths){
	this.id=id;
	this.name=name;

	this.phy=phy;
	this.che=che;
	this.maths=maths;


	}

	public String getName() {
	return name;
	}

	public void setName(String name) {
	this.name = name;
	}

	public int getId() {
	return id;
	}

	public void setId(int id) {
	this.id = id;
	}

	public int getPhy() {
	return phy;
	}

	public void setPhy(int phy) {
	this.phy = phy;
	}

	public int  getChe() {
	return che;
	}

	public void setChe(int  che) {
	this.che = che;
	}

	public int  getMaths() {
	return maths;
	}

	public void setMaths(int  maths) {
	this.maths = maths;
	}
	double percentage() {

	return (phy+maths+che)/3;

	}
	@Override
	public String toString() {
	return   id +"   "+name+"   "+ phy +"   " + che +"  "+ maths+"  "+percentage();
	}
	@Override
	public int compareTo(Student o) {
	if(percentage()<o.percentage())
	return -1;
	else if (percentage()>o.percentage())
	return 1;
	return 0;
	}
	}

	

	