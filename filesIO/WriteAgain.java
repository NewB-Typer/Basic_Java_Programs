package files;
import java.io.FileWriter;
import java.io.IOException;
public class WriteAgain {
public static void main(String[] args) {
	try {
	FileWriter again = new FileWriter("check.txt");
	again.write("This is to check whether it is working or not.");
	again.append(" >> I am basically adding nothing");
	again.close();
	}
catch(IOException e) {
	
}

}
}
