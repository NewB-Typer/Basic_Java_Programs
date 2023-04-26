package socket.JAVA.tcp;
import java.net.*;
import java.io.*;


public class ONeWaySErver {
public static void main(String[] args) throws Exception{
	
	ServerSocket ss = new ServerSocket(9999);
	Socket s = ss.accept();
	
	BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
	String take = br.readLine();
	
	System.out.println("This: " + take);
	
	ss.close();
	s.close();
	br.close();
	
}
}
