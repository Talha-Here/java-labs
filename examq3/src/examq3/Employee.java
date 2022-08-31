/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examq3;

/**
 *
 * @author TALHA
 */
public class Employee {
    private String E_name;
    private double E_salary;
    private int E_experience;
    
    void setE_name(String E_name){
        this.E_name = E_name;
    }
 void setE_salary(double E_salary){
        this.E_salary = E_salary;
    }
 void setE_experiencedouble(int E_experience){
        this.E_experience = E_experience;
    }
 
 String getE_name(){
     return E_name;
 }
  double getE_salary(){
     return E_salary;
 }
   int getE_experience(){
     return E_experience;
 } 
}
