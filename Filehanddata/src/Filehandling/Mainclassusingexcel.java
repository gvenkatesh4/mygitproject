package Filehandling;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;



public class Mainclassusingexcel {

	public static void main(String[] args) throws IOException {
		
		
		
		FileOutputStream output = new FileOutputStream("gvenkatesh.txt");
		FileWriter R = new FileWriter("gvenkateshh.csv");
		BufferedWriter w1 = new BufferedWriter(R);
		Productdatausingexce obj = new Productdatausingexce("tv", 250000);
		Productdatausingexce obj1 = new Productdatausingexce("refridgerator",50000);
		Productdatausingexce obj2 = new Productdatausingexce("sound system",30000);
		Productdatausingexce obj3 = new Productdatausingexce("alexa",10000);
		Productdatausingexce obj4 = new Productdatausingexce("smart watch",5000);
		Productdatausingexce obj5 = new Productdatausingexce("ear phones",25000);

		
		
		ArrayList<Productdatausingexce>t=new ArrayList();
		t.add(obj);
		t.add(obj1);
		t.add(obj2);
		t.add(obj3);
		t.add(obj4);
		t.add(obj5);
		

			System.out.println(t);
		
		for(Productdatausingexce e:t) {
			System.out.println(e);
		}
		Iterator<Productdatausingexce>itr = t.iterator();
		while(itr.hasNext()) {
			Productdatausingexce i = itr.next();
			if(i.getcost()<5000) {
				itr.remove();
			}
			
			
			try {
				
				
				throw new  Datainvalidexcel("it is not correct");
			
					
				}
				catch(Datainvalidexcel a) {
					a.printStackTrace();
					
				}
				w1.write("id,product,cost\n");
			for(Productdatausingexce e:t) {
				
				String s =e.toString();
				output.write(s.getBytes());
				w1.write(s);
				w1.newLine();
				w1.close();
				


			}
			
			
				
			}
					
					
			}
		
	
	
}


		
