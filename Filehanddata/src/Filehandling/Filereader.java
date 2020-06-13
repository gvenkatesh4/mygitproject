package Filehandling;

import java.io.FileReader;
import java.io.IOException;

public class Filereader {

	public static void main(String[] args) throws IOException {
		FileReader t = new FileReader("ttt.txt");
		
		int tt = t.read();
		while(tt!=-1)
		{
			System.out.print((char)tt);
			tt=t.read();
		}
		t.close();
		

	}

}
