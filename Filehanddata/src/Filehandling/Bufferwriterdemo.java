package Filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Bufferwriterdemo {

	public static void main(String[] args) throws IOException {
		
		FileWriter w = new FileWriter("wri.csv");
		BufferedWriter wr = new BufferedWriter(w);
		
		wr.write("id,name,phno,country\n");
		wr.write("1245,xxxx,yyyy,iiii");

		wr.close();
		w.close();
	}

}
