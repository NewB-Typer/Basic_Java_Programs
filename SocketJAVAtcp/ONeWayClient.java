package socket.JAVA.tcp;
import java.net.*;
import java.io.*;

public class ONeWayClient {
public static void main(String[] args) throws Exception{
	
	/*    Also can be done
	String ip = "localhost";
	int port = 9999;  */
	Socket sc = new Socket("localhost",9999);
	
	String pr = "End is the Beginning";
	
	OutputStreamWriter osw = new OutputStreamWriter( sc.getOutputStream());
	PrintWriter pw = new PrintWriter(osw);
	pw.println(pr);
	
	pw.flush();
	sc.close();
	osw.close();
	pw.close();
	
	
	
}
}
