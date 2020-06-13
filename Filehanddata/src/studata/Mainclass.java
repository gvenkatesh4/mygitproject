package studata;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Filehandling.Bufferreaderdemo;

public class Mainclass {

	public static void main(String[] args)  throws IOException{
		ArrayList<Student> a=new ArrayList<Student>();
		BufferedReader br = new BufferedReader(new FileReader("stude.csv"));
		String line = br.readLine();
		line=br.readLine();
		while(line != null)
		{
			String[] s = line.split(",");
			
			int id = Integer.parseInt(s[0]);
			String name = s[1];
			int sub1= Integer.parseInt(s[2]);
			int sub2= Integer.parseInt(s[3]);
			int sub3= Integer.parseInt(s[4]);
			
			Student s1 = new Student(id,name,sub1,sub2,sub3);
			System.out.println(s1);
			a.add(s1);
			
			line = br.readLine();

		}


		
		
	}

}
