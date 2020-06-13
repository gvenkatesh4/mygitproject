package abc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Asd {

	public static void main(String[] args) throws IOException {
		InputStream obj = new FileInputStream("input.txt");
		System.out.println(obj.available());
	}

}

