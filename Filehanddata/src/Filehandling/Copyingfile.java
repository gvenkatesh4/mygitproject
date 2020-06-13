package Filehandling;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Copyingfile {

	public static void main(String[] args) {
		File sourcefile=new File("baa.txt");
		File destinationfile = new File("newnew.txt");
		try {
			Files.copy(sourcefile.toPath(), destinationfile.toPath());
			
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("baa.txt");
		}
	}

}
 