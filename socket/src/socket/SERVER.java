/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socket;
import java.net.*;
import java.util.*;
import java.io.*;
//public class Socket {

    /**
     * @param args the command line arguments
     */

public class SERVER {
    public static void main(String[] args) throws IOException {
      try{  
        ServerSocket ss=new ServerSocket(6666);   
        Socket s = ss.accept();
        Scanner sc=new Scanner(s.getInputStream()); 
        String x =sc.nextLine(); 
        x=x.toLowerCase(); 
        x=x.toUpperCase();
        StringBuilder input1 = new StringBuilder();
        input1.append(x);
        input1.reverse();
        System.out.println(input1);   
PrintStream ps=new PrintStream(s.getOutputStream()); 
ps.println(input1); }
catch(Exception e){
    System.out.println(e);
}}}


 

