/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketprog;

/**
 *
 * @author TALHA
 */
import java.io.*;
import java.net.*;
class factclient{
    public static void main(String argv[]) throws Exception
    {
        String n;
        DatagramSocket clientSocket = new DatagramSocket();
        byte []send=new byte[102];
        byte []resive=new byte[102];
        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\nEnter Number : ");
        n=inFromUser.readLine();
        InetAddress ipadd= InetAddress.getByName("localhost");
        send=n.getBytes();
        DatagramPacketsendPck=new DatagramPacket(send,send.length,ipadd,6870);
        clientSocket.send(sendPck);
        DatagramPacket resPck=new DatagramPacket(resive,resive.length);
        clientSocket.receive(resPck);
        String fact=new String(resPck.getData());
        System.out.println("FROM SERVER: " +n+"! = " +fact);
        clientSocket.close();
    }
}

class factserver{
    public static void main(String argv[]) throws Exception
    {
        String num,res;
        int i,no;
        long fact;
        System.out.println("Server is ready");
        DatagramSocket serverSocket = new DatagramSocket(6870);
        byte []send=new byte[102];
        byte []resive=new byte[102];
        DatagramPacket resPck=new DatagramPacket(resive,resive.length);
        serverSocket.receive(resPck);
        num=new String(resPck.getData());
        num=num.trim();
        no=Integer.parseInt(num);
        fact=1;
        for(i=1;i<=no;i++)
            fact=fact*i;
        res=Long.toString(fact);
        send=res.getBytes();
        InetAddress ipadd= resPck.getAddress();
        int port=resPck.getPort();
        DatagramPacketsendPck=new DatagramPacket(send,send.length,ipadd,port);
        serverSocket.send(sendPck);
    }
}

public class Socketprog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
