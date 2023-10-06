package server_package;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			System.out.println("je suis un serveur");
		    ServerSocket ss = new ServerSocket(1234);
		    System.out.println("j attend un client ...");
		    Socket s = ss.accept(); /*stocker la réponse du serveur socket*/
		    System.out.println("un client est connecté");
		    /*activité 2*/
		    /*étape 1:creation de stream entre serv et clt*/
		    OutputStream os = s.getOutputStream();
			InputStream is = s.getInputStream();
			/*étape 3*/
			int nb = is.read();
			System.out.println("j'ai recu la valeur"+nb);
			/*étape 4*/
			int rep = nb*5;
			/*étape 5*/
			os.write(rep);
			/*fin act2*/
			System.out.println("déconnection serveur");
			s.close();
			ss.close();
		}
		catch(Exception e){
			e.printStackTrace();/*exception si n'y a pas des clients connectés*/
		}
	}

}
