package Filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class Filewriter {

	public static void main(String[] args) throws IOException {
		FileWriter o = new FileWriter("talent.txt");
		o.write("this is string");
		o.close();
	}

}
