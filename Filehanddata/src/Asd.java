import java.io.FileInputStream;
import java.io.InputStream;

public class Asd {

	public static void main(String[] args) {
		InputStream obj = new FileInputStream("input.txt");
		System.out.println(obj.available());
	}

}
