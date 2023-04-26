package exam.Practise.IO;
import java.io.*;

public class WriterFile {
public static void main(String[] args) throws IOException{
	FileWriter  fw = new FileWriter("Text.txt");
	fw.write("This is Pretty easy");
	fw.append("\n Bye!");
	
	fw.close();
	
	
}
}
