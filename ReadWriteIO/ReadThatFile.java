package questions.exam.java;
import java.io.*;
import java.io.FileReader;


public class ReadThatFile {
public static void main(String [] args) {
	
	 File find = new File("Vowel.txt");
	 File find1 = new File("Consonant.txt");
		if(find.exists() || find1.exists()) {
			
	try {
	FileReader Fread = new FileReader("Vowel.txt");
	FileReader Fread1 = new FileReader("Consonant.txt");
	int vowel = Fread.read();
	int cons = Fread1.read();
	while(vowel != -1) {{
		System.out.println("Vowels = " + (char)vowel);
	}
		vowel = Fread.read();
	}
	while(cons != -1    ) {{
		System.out.println("Consonants = " + (char)cons);
	}
	cons = Fread1.read();
	}
	System.out.println("Consonants = " + (char)cons);
	Fread.close();
	Fread1.close();
	}
	catch(IOException e) {
		System.out.println("IO Exception occured!!");
		}
		}
		else {
			System.out.println("One or both files do not exist!! ");
		}
		
		}		
}
