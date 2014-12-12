package test;

import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class WriterServer {
	
	

	Socket creatSocket(InetAddress address,int port) throws IOException 
	{  
		
		return new Socket(address,port);
	}
	
	void sendServer(char cbuf[] ,Socket server) throws IOException{
	try{	
	OutputStreamWriter out	=new OutputStreamWriter(server.getOutputStream());
	int off=0;
	out.write(cbuf, off, cbuf.length);
	server.close();
	}
	catch(IOException e)
    {
       System.out.print("probleme d'envoie");
       
    }
		
	}

}