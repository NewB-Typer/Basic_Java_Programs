package exam.Practise.IO;
import java.io.*;

public class ByteInput {
public static void main(String[] args) throws IOException{
	FileInputStream is = new FileInputStream("Ask.txt");
	int j = 0;
	while(   (j=is.read()) != -1) {
		System.out.print((char) j);
	}
	is.close();	
	
}
}
