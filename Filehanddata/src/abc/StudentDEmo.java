package abc;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class StudentDEmo {

public static void main(String[] args) throws IOException {
List<Student> list=new ArrayList<Student>();
BufferedReader br=new BufferedReader(new FileReader("studentp.csv"));
String line=br.readLine();
System.out.println(line);
line=br.readLine();
while(line!=null) {
String s[]=line.split(",");
int id=Integer.parseInt(s[0]);
String name=s[1];
int phy=Integer.parseInt(s[2]);

int che=Integer.parseInt(s[3]);

int maths=Integer.parseInt(s[4]);
Student s1=new Student(id,name,phy,che,maths);
list.add(s1);
line=br.readLine();



}

Collections.sort(list);
for(Student e:list) 
System.out.println(e);
br.close();


}

}
