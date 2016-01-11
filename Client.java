import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.*;


public class Client {
	public final static int PORT=7436;
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		InetAddress addr = InetAddress.getByName("169.231.26.163");
		Socket s=new Socket(addr,PORT);
		PrintStream ps=new PrintStream(s.getOutputStream());
		ps.println("Hello to server from client");
		InputStreamReader isr=new InputStreamReader(s.getInputStream());
		BufferedReader br=new BufferedReader(isr);
		String a=br.readLine();
		System.out.println(a);
	}

}
