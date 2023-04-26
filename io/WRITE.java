package io;
import java.io.FileWriter;
import java.io.IOException;

public class WRITE {
	public static void main(String[] args) {
	try {
		FileWriter input = new FileWriter("Warning.txt");
		input.write("When the Light hits the sky, it's not just a tool");
		input.write("\n IT's A WARNING");
		input.append(">>For them << ");
		input.close();

	} 
//	throw IOException System.out.println(" Exception caused");
		catch(IOException e ) {
			}
		finally{
		System.out.println("Message Delivered...");
		}

	}

}
