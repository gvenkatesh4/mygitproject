package Filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class Copyingfromonrfiletoanotherfile {

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream input = new FileInputStream("Read.txt");

		FileOutputStream output = new FileOutputStream("Write.txt");
		int a;
		while((a=input.read())!=-1){
		output.write(a);
		}
		input.close();
		output.close();
		}
		}


