package javapro;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import Filehandling.FileoutputStreamDemo;
import Filehandling.Filewriter;

public class Mainclass {

	public static void main(String[] args) throws IOException {
		Detailsdata obj = new Detailsdata("tv",2500);
		Detailsdata obj1 = new Detailsdata("phone",20000);
		Detailsdata obj2 = new Detailsdata("watch",10000);
		Detailsdata obj3 = new Detailsdata("fan",5200);
		Detailsdata obj4 = new Detailsdata("ac",68000);
		
		List<Detailsdata>t=new ArrayList<Detailsdata>();
		t.add(obj);
		t.add(obj1);
		t.add(obj2);
		t.add(obj3);
		t.add(obj4);
FileOutputStream output = new FileOutputStream("p.txt");

		

		ArrayList<Detailsdata>t1=new ArrayList<Detailsdata>();
		for(Detailsdata e:t)
		{
			System.out.println(e);
		}
		Iterator<Detailsdata>itr=t.iterator();
		while(itr.hasNext()) {
			Detailsdata i =itr.next();
			if(i.getCost()<10000) {
				t1.add(i);
				itr.remove();
			}
			
		}
		System.out.println("----------------");
		for(Detailsdata e:t1)
		{
			System.out.println(e);
		}
		for(Detailsdata e:t) {
			String s = e.toString();
			output.write(s.getBytes());
		}
		System.out.println("------------");
		for(Detailsdata e:t1)
		{
			String s = e.toString();
			output.write(s.getBytes());
		}
		}

}
