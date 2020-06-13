package file1;

public class Productcsv {
	private int id;
	private int cost;
	private String product;
	
	private static int idgenerator=100;
	public Productcsv(){
		
	}
   public	Productcsv(int cost,String product) {
	   id=idgenerator++;
	   this.cost=cost;
	   this.product=product;
   }
protected int getId() {
	return id;
}
protected void setId(int id) {
	this.id = id;
}
protected int getCost() {
	return cost;
}
protected void setCost(int cost) {
	this.cost = cost;
}
protected String getProduct() {
	return product;
}
protected void setProduct(String product) {
	this.product = product;
}
protected static int getIdgenerator() {
	return idgenerator;
}
protected static void setIdgenerator(int idgenerator) {
	Productcsv.idgenerator = idgenerator;
}
@Override
public String toString() {
	return id+","+cost+","+product+"\n";
}
	

}
