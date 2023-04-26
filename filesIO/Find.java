package files;
import java.io.File;

public class Find {
public static void main(String[] args) {
	
	File file = new File("SouthPark.txt");
	// or location of the file i.e home/user/directory/file.txt
	if(file.exists()) {
		System.out.println("File is successfully found!!");
		System.out.println(file.getPath());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.isFile());
	// file.delete();
	}
	else {
		System.out.println("File is not found!!");
	}
	
}
}
