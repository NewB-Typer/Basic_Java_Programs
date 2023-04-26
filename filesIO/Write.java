package files;
import java.io.FileWriter;
import java.io.IOException;
public class Write {
public static void main(String[] args) {
try {	
	FileWriter input = new FileWriter("SouthPark1.txt");
	input.write("He asked me foe thre fiddy \n");
   input.append("(i hear no bell!! )");
   input.close();
}
catch(IOException z) {
	System.out.println("Done!!");
// z.printStackTrace();
}
}
	
}
