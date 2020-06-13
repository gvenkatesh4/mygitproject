package Writingdatatocsv;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import Filehandling.Filewriter;

public class Mainclass {

	public static void main(String[] args) throws IOException {
		Datapro obj = new Datapro(100,"tv",(float) 256.3);
		Datapro obj1 = new Datapro(100,"tv",(float) 256.3);
		Datapro obj2 = new Datapro(100,"tv",(float) 256.3);
		
		ArrayList<Datapro>t=new ArrayList<Datapro>();
		t.add(obj);
		t.add(obj1);
		t.add(obj2);
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("d.csv"));
		bw.write("id,name,cost,\n");
		
		
		for(Datapro r:t)
		{
			bw.write(r.toString());
		}

		bw.close();
		}

}
