/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examq3;
import java.util.*;
/**
 *
 * @author TALHA
 */
public class Examq3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();
        emp.setE_name("Talha");
        System.out.println(emp.getE_name());
        emp.setE_salary(75000.5694);
        System.out.println(emp.getE_salary());
        emp.setE_experiencedouble(4);
        System.out.println(emp.getE_experience());
    }   
}
