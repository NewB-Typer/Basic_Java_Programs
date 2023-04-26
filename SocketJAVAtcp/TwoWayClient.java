package socket.JAVA.tcp;
import java.net.*;
import java.io.*;

public class TwoWayClient {
public static void main(String[] args) throws Exception{
	Socket s = new Socket("localhost" , 3306);
	String st = "This is TWO way";
	
	OutputStreamWriter osw = new OutputStreamWriter(s.getOutputStream());
	PrintWriter iw = new PrintWriter(osw); 	
	iw.println(st);
	osw.flush();
	
	BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
	String z = br.readLine();
	
	System.out.println(z);
	
	s.close();
	osw.close();
	iw.close();
}
}
