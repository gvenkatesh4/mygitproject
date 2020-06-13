package Filehandling;

public class Productdatausingexce {
	private int id=100;
	private String product;
	private int cost;
	
	public static int idgenerator=100;
	
	public Productdatausingexce() {
		
	}
	public Productdatausingexce(String product,int cost) {
		id=idgenerator++;
		this.product=product;
		this.cost=cost;
	}
	protected void setid(int id) {
		this.id=id;
	}
	protected int getid() {
		return id;
	}
	
	protected void setproduct(String product) {
		this.product=product;
	}
	protected String getproduct() {
		return product;
	}
protected void setcost(int cost) {
	this.cost=cost;
}
protected int getcost() {
	return cost;
}
@Override
public String toString() {
	return id+","+product+","+cost;
}



}
