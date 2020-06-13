package Writingdatatocsv;

public class Datapro {
	private int id;
	private String name;
	private float cost;
	
	public Datapro() {
		
	}
		public Datapro(int id,String name,float cost) {
			this.id=id;
			this.name=name;
			this.cost=cost;
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
		protected float getCost() {
			return cost;
		}
		protected void setCost(float cost) {
			this.cost = cost;
		}
		@Override
		public String toString() {
			return id+","+name+","+cost+"\n";

		}
		
}
