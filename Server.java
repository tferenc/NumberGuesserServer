import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by tamasferenc on 2017.03.17..
 */
public class Server implements Runnable
{
    ServerSocket server;

    public Server(int port)
    {
        try
        {
            server = new ServerSocket(port);
            new Thread(this).start();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void run()
    {
        try
        {
            while (true)
            {
                Socket socket = server.accept();
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
