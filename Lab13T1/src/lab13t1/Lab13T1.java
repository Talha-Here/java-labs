/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab13t1;
import java.util.*;
/**
 *
 * @author TALHA
 */
public class Lab13T1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner em = new Scanner(System.in);
        System.out.println("Write your e-mail:");
        String e = em.nextLine();
        System.out.println("Username: "+username(e));
        System.out.println("Domain: "+domain(e));
        System.out.println("Extension: "+extension(e));
    }
    static String username(String id){
        int i = 0;
        int x = id.indexOf('@');
        return id.substring(i,x);
    }
    static String domain(String id){
        int i = id.indexOf('@') +1 ;
        int x = id.indexOf('.');
        return id.substring(i,x);
    }
    static String extension(String id){
        int i = id.lastIndexOf('.') +1 ;
        int x = id.length();
        return id.substring(i,x);
    }    
}
