package Filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Bufferreaderdemo {

	public static void main(String[] args) throws IOException {
		
		
		FileReader r = new FileReader("info.csv");
		BufferedReader br = new BufferedReader(r);
		
		
		String line = br.readLine();
		while(line!=null)
		{
			System.out.println(line);
			line=br.readLine();
		}
		//System.out.println(line);
		
		br.close();
		r.close();
		
	}

}
+