package files;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
public class Read {

	public static void main(String[] args) {
try {
	FileReader output = new FileReader("ascii.txt");
		int text = output.read(); //storing ascii.txt to text
		
		while(text != -1) {
			System.out.print((char)text); //reading single character
		text = output.read(); // read next char
		} output.close();
}
catch(FileNotFoundException c ){
	//c.printStackTracer();
}
catch(IOException c ){
	//c.printStackTracer();
}
	}
}
