package Disstance;
import java.util.Comparator;
import java.util.Map;

public class DistanceComparator implements Comparator<String> {
		Map<String, Double> m;

		DistanceComparator(Map<String, Double> m) {
		this.m = m;
		}

		public int compare(String s1, String s2) {

		int i = 0;
		if (m.get(s1) > m.get(s2))
		i = 1;
		else if (m.get(s1) <= m.get(s2))
		i = -1;

		return i;
		}

		

}

