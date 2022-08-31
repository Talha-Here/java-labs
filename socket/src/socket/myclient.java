/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socket;

/**
 *
 * @author TALHA
 */
import java.net.*;
import java.util.*;
import java.io.*;
public class myclient {
            public static void main(String[] args) throws IOException {
            try {
            Scanner sc = new Scanner(System.in);
            Socket s = new Socket("127.0.0.1" , 6666);
            Scanner sc1 = new Scanner(s.getInputStream());
            System.out.print("Enter String : ");
            String str = sc.nextLine();
            PrintStream ps = new PrintStream(s.getOutputStream());
            ps.println(str);	
            System.out.println("Client sent: "+ str);
            String sr = sc1.nextLine();
            System.out.println("Server sends: " + sr);
        }
catch (Exception e) {
            System.out.println(e);
        }}}

