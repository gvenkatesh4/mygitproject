package Disstance;

public class Points {
	private int x, y;
	private String name;

	public Points() {

	}
	public Points(String name, int x, int y) {
	super();
	this.name = name;
	this.x = x;
	this.y = y;
	}
	public String getName() {
	return name;
	}

	public void setName(String name) {
	this.name = name;
	}

	public int getX() {
	return x;
	}

	public void setX(int x) {
	this.x = x;
	}

	public int getY() {
	return y;
	}

	public void setY(int y) {
	this.y = y;
	}



	@Override
	public String toString() {
	return name + "(" + x + "," + y + ")";
	}

	}


