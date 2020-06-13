package Studentdetailsusingcsv;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Mainclass {

	public static void main(String[] args) throws IOException {
		Student a= new Student("venkatesh",2019,500);
		Student b= new Student("manish",2019,600);
		Student c= new Student("yeswanth",2019,550);
		Student d= new Student("karthik",2019,800);
		Student e= new Student("prashanth",2019,800);
		
		ArrayList<Student>obj=new ArrayList<Student>();
		
		obj.add(a);
		obj.add(b);
		obj.add(c);
		obj.add(d);
		obj.add(e);
		
		for(Student p : obj) {
			System.out.println(p);
		}
		
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("studentdata.csv"));
		bw.write("id,name,year,marks\n");
		
		for(Student p:obj) {
			bw.write(p.toString());
		}
		
		bw.close();
	}

}
