package studentinfodata;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Mainclass {

	public static void main(String[] args) throws IOException {
		
		TreeSet<Studentinformation> s = new TreeSet<Studentinformation>();
		BufferedReader br = new BufferedReader(new FileReader("talent.csv"));
		
		String line = br.readLine();
		line = br.readLine();
		while(line != null){
			String[] st = line.split(",");
			
			int id = Integer.parseInt(st[0]);
			String name = st[1];
			
			int sub1 = Integer.parseInt(st[2]);
			int sub2 = Integer.parseInt(st[3]);
			int sub3 = Integer.parseInt(st[4]);
			
			Studentinformation stu = new Studentinformation(id,name,sub1,sub2,sub3);
			System.out.println(stu);
			s.add(stu);
			line = br.readLine();
		}

//Collections.sort(s);
	//Collections.sort(s);
		for(Studentinformation e:s) 
			System.out.println(e);
		br.close();
	}

}
