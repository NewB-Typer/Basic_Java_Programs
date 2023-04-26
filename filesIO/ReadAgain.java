package files;
import java.io.FileReader;
import java.io.IOException;

public class ReadAgain {
public static void main(String[] args ) {
	try {
		FileReader display = new FileReader("check.txt"); //opening the .txt file
		int suck = display.read(); // assigning suck to the place value of .txt file <as integer>
		while(suck != -1) {  // do until value of suck is empty or -1
			System.out.print((char)suck); // print the data of suck, single character at a time
			suck = display.read(); //sends to the next character
		} display.close(); //closing
	}
	
	catch(IOException a ) {
		
	}	
}
	}
