package io;
import java.io.*;
import java.io.IOException;

public class READ {
public static void main( String[] args) {
try {
	FileReader output = new FileReader("Warning.txt");
	int count = output.read();
	while(count != -1 ) {
System.out.print((char)count);
count = output.read();		
}
	output.close();
}
catch(FileNotFoundException o) {
	
}
catch(IOException o) {
	
}



}
}