package javapro;

public class Detailsdata {
	private int id;
	private String product;
	private int cost;
	
	private static int idgenerator=100;
	Detailsdata(){
		
	}
	Detailsdata(String product,int cost){
		this.id=idgenerator++;
		this.product=product;
		this.cost=cost;
		
	}
	protected int getId() {
		return id;
	}
	protected void setId(int id) {
		this.id = id;
	}
	protected String getProduct() {
		return product;
	}
	protected void setProduct(String product) {
		this.product = product;
	}
	protected int getCost() {
		return cost;
	}
	protected void setCost(int cost) {
		this.cost = cost;
	}
	protected static int getIdgenerator() {
		return idgenerator;
	}
	protected static void setIdgenerator(int idgenerator) {
		Detailsdata.idgenerator = idgenerator;
	}
	@Override
	public String toString() {
		return "Detailsdata [id=" + id + ", product=" + product + ", cost=" + cost  +"\n"+"]";
	}

	
}
