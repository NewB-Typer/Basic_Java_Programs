package exam.Practise.IO;
import java.io.*;

public class ReaderFile {
public static void main(String[] args) throws IOException{
	FileReader fr = new FileReader("Text.txt");
	int y = 0;
	while((y=fr.read()) != -1) {
		System.out.print((char)y);
	}
	
	
	
}
}
