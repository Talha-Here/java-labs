/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examq4;
import java.util.*;
/**
 *
 * @author TALHA
 */
public class Examq4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("1.Manager\n2.Human Resource\n3.Worker");
        System.out.println("Choose your option");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        
       switch(choice){
           case 1:
               Manager m=new Manager();
               break;
           case 2:
               HumanResource h=new HumanResource();
               break;
           case 3:
               Worker w=new Worker();
               break;
           default:
               System.out.println("Wrong Option");
       }   
    }
    }
  
