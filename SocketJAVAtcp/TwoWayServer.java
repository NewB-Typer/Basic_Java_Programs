package socket.JAVA.tcp;
import java.net.*;
import java.io.*;



public class TwoWayServer {
public static void main(String[] args) throws Exception{
	ServerSocket ss = new ServerSocket(3306);
	Socket s = ss.accept();
	
BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
	String n = br.readLine();
	

	System.out.println("Client data : " + n);
// we take the value of n from readline .i. from client
	String z = n.substring(0,4);
	//takes the 0-4th index char of string
	
OutputStreamWriter osw = new OutputStreamWriter(s.getOutputStream());
PrintWriter pw = new PrintWriter(osw);
pw.println(z);
	
	pw.flush();
	
	ss.close();
	s.close();
	br.close();
	
}
}
