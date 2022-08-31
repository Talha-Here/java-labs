/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg1;
import java.util.*;
/**
 *
 * @author TALHA
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[ ] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("The First Integer: ");
        int a=sc.nextInt();
        System.out.print("The Second Integer: ");
        int b=sc.nextInt();
        System.out.print("The Third Integer: ");
        int c=sc.nextInt();
        System.out.print("The Fourth Integer: ");
        int d=sc.nextInt();
        int f=Math.min(Math.min(a, b), Math.min(c, d));
        System.out.println("The smallest integer was: "+f);
    int e=Math.max(Math.max(a, b), Math.max(c, d));
    System.out.println("The largest integer was "+e);
    System.out.println("The sum of these four integers is: " + (a+b+c+d));
}
}
   
    

