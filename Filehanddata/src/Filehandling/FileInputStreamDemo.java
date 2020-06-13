package Filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream input = new FileInputStream("input.txt");
		int c = input.read();
		
		while(c!=-1) {
			System.out.print((char) c);
			c = input.read();
		}
		input.close();
	}

}
