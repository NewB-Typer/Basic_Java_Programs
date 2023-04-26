package exam.Practise.IO;
import java.io.*;

public class ByteOutput {
	public static void main(String[] args)throws IOException{
FileOutputStream os = new FileOutputStream("Ask.txt");
String so = "End is The Beginning ";

char[] c = so.toCharArray();
for(int i = 0 ; i < c.length; i++ ) {
	os.write(c[i]);
}
System.out.println("Done");
os.close();
}
}