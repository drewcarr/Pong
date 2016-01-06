import java.io.InputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.Socket;
public class TTTClient{
	public static int xPos = 0, yPos = 0;
	public static PrintWriter p;
	public static Socket sock;
	public static BufferedReader br;
	public static void main(String args[]) throws IOException{
		sock = new Socket("127.0.0.1",55555);
		p = new PrintWriter(sock.getOutputStream(),true);
		sendMessage("Hello");
	}
	public static void sendMessage(String message) throws IOException{
		p.print(message);
		p.flush();
		System.out.println("flushed");
		InputStream is = sock.getInputStream();
		System.out.println("Created Input Stream");
		InputStreamReader isr = new InputStreamReader(is);
		System.out.println("Created Input Stream Reader");
		br = new BufferedReader(isr);
		System.out.println("Created Buffered Reader");
		String answer = br.readLine();
		System.out.println("Server says: " + answer);
	}
}
