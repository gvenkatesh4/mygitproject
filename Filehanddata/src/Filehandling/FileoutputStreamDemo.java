package Filehandling;


import java.io.FileOutputStream;
import java.io.IOException;

public class FileoutputStreamDemo {

	public static void main(String[] args) throws IOException {
		FileOutputStream output = new FileOutputStream("T.txt");
		String s = "Amazon.com, Inc., is an American "
				+ "multinational technology company based in"
				+ " Seattle that focuses on e-commerce,"
				+ " cloud computing, digital streaming,"
				+ " and artificial intelligence. "
				+ "It is considered one of the "
				+ "Big Four tech companies, along "
				+ "with Google, Apple, and Facebook. Wikipedia";
		output.write(s.getBytes());
		
		output.close();
	}

}

