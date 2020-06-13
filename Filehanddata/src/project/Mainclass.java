package project;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Filehandling.Filereader;

public class Mainclass {

	public static void main(String[] args) throws IOException {
		List<Data>s=new ArrayList<Data>();
		BufferedReader w= new BufferedReader(new FileReader("in.csv"));
		String line = w.readLine();
		line = w.readLine();
		while(line!=null) {
			String[] a = line.split(" ");
			
			int id = Integer.parseInt(a[0]);
			String name=a[1];
			int sub1=Integer.parseInt(a[2]);
			int sub2 = Integer.parseInt(a[3]);
			int sub3 = Integer.parseInt(a[4]);
			int sub4 = Integer.parseInt(a[5]);
			
			Data stu = new Data(id,name,sub1,sub2,sub3,sub4);
			System.out.println(stu);
			s.add(stu);
			line=w.readLine();
			
			
			
		}

		
		
	}

}
