package Disstance;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class PointDistance {
	ArrayList<Points> list = new ArrayList<Points>();
	Map<String, Double> m = new HashMap<String, Double>();

	public void addPoint() throws IOException {

	BufferedReader br = new BufferedReader(new FileReader("Pointd.csv"));
	String line = br.readLine();
	System.out.println(line);

	line = br.readLine();
	while (line != null) {
	String[] s = line.split(",");

	Points p = new Points(s[0], Integer.parseInt(s[1]), Integer.parseInt(s[2]));
	list.add(p);
	line = br.readLine();
	}

	System.out.println(" Points ");
	for (Points p : list) {
	System.out.println(p);
	}
	}

	public static double distance(Points a1, Points a2) {
	int x1 = a1.getX();
	int y1 = a1.getY();

	int x2 = a2.getX();
	int y2 = a2.getY();

	return Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
	}

	public void DistanceCal() {

	for (int i = 0; i < list.size(); i++) {

	for (int j = i + 1; j < list.size(); j++) {
	Points a1 = list.get(i);
	Points a2 = list.get(j);

	String key = a1 + "," + a2;
	double value = distance(a1, a2);
	m.put(key, value);
	}
	}

	}

	public void sortMapByValue() {
	DistanceComparator d = new DistanceComparator(m);

	TreeMap<String, Double> m1 = new TreeMap<String, Double>(d);
	m1.putAll(m);

	System.out.println("-------------------------------------");
	for (Entry<String, Double> e : m1.entrySet()) {
		
		
	System.out.println(e);
	} 

	}

	public static void main(String[] args) throws IOException {
	PointDistance p = new PointDistance();
	p.addPoint();
	p.DistanceCal();
	p.sortMapByValue();
	}
	}


