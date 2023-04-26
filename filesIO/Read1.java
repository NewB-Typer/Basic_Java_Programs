package files;
import java.io.FileReader;
import java.io.IOException;

public class Read1 {
public static void main(String[] args) {
	try {
		FileReader reader = new FileReader("SouthPark.txt");
		int from = reader.read();
		while(from != -1) {
			System.out.print((char)from);
			from= reader.read();			
		}
		reader.close();
	}	
  catch(IOException s ){
	}
}
}
