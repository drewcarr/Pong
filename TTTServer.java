import java.io.*;
import java.net.*;
public class TTTServer{
	public static Socket socket;
	public static BufferedReader in;
	public static PrintWriter out;
	public static ServerSocket serverSocket;
	public static void main(String args[]){

		run();
	}
	public static void run()
	{
		try
		{
			serverSocket = new ServerSocket(55555);
			System.out.println("Connecting");
			socket = serverSocket.accept();
			System.out.println("Connected from " + socket.getInetAddress().getHostName());
			out = new PrintWriter(socket.getOutputStream(), true);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//Recieve Message
			String message = in.readLine();
			System.out.println("Client says: " + message);
			//Send Message
			sendMessage("Goodbye");
		}
		catch(IOException ioException)
		{

		}
		finally
		{
			try
			{
				socket.close();
			}
			catch(IOException ioException)
			{
				ioException.printStackTrace();
			}
		}
	}
	public static void sendMessage(String mess)
	{
		out.print(mess);
		out.flush();
		System.out.println("Sent message: " + mess);

	}
}
