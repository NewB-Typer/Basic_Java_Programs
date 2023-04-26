package exam.Practise.IO;
import java.io.*;
import java.util.Scanner;

public class writeByte {
public static void main(String[] args) throws IOException{
	FileOutputStream os = new FileOutputStream("End.txt");
Scanner sn = new Scanner(System.in) ;	
	
System.out.print("Give Input: ");
String give = sn.nextLine();

char [] h = give.toCharArray();
for(int i=0 ; i < h.length; i++) {
	os.write(h[i]);
}

System.out.print("Done. ");
	os.close();
}
}
