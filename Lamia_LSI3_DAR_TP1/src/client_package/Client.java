package client_package;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			/*activité 3
			InetAddress inetadd = InetAddress.getByName("10.26.15.197");
			InetSocketAddress isa = new InetSocketAddress(inetadd, 1234);
			Socket s = new Socket();
			s.connect(isa);
			fin act3*/
			System.out.println("je suis un client pas encore connecté");
			Socket s = new Socket("192.168.56.1",1234);
			System.out.println("je suis connecté au serveur");
			/*activité 2*/
			int nb;
			/*étape 1*/
			OutputStream os = s.getOutputStream();
			InputStream is = s.getInputStream();
			
			Scanner sc = new Scanner(System.in);
			System.out.print("ecrire un nbr");
			nb = sc.nextInt();
			/*étape 2*/
			os.write(nb);
			/*étape 6*/
			int rep=is.read();
			/*étape 7*/
			System.out.println("le produit de "+nb+"*5 = "+rep);
			/*fin act2*/
			System.out.println("déconnection client");
			s.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();/*exception si n'y a pas un serveur ou le serveur n'est pas activé*/
		}

	}

}
