package file1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Mainclass {

	public static void main(String[] args) throws IOException {
		
		Productcsv a= new Productcsv(5000,"tv1");

		Productcsv b= new Productcsv(5000,"tv1");
		Productcsv c= new Productcsv(5000,"tv2");

		
		ArrayList<Productcsv>ob=new ArrayList();
		ob.add(a);
		ob.add(b);
		ob.add(c);
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("product.csv"));
		bw.write("id,cost,product,\n");
		
		for(Productcsv p :ob) {
			bw.write(p.toString());
		}
		bw.close();
	}

}
