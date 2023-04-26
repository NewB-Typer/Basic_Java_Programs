package exam.Practise.IO;
import java.io.*;

public class ReadByte {
public static void main(String[] args) throws IOException{
	FileInputStream is = new FileInputStream("End.txt");
	int z = 0;
	while(   (z=is.read()) != -1) {
		System.out.print((char)z);
	}
	
is.close()	;
}
}
