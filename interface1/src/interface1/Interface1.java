/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface1;

/**
 *
 * @author TALHA
 */

interface CreditCard{
    void rupees();
    void dollars();
    void pounds();
}
 class BankAccount implements CreditCard{
    @Override
    public void rupees(){
        System.out.println("this is rupees");
    }
    @Override
    public void dollars(){
        System.out.println("this is dollars");
    }
    @Override
    public void pounds(){
        System.out.println("this is pounds");
    }
}
public class Interface1 {
    public static void main(String[] args) {
         BankAccount obj1 = new BankAccount();
        CreditCard obj2 = new BankAccount();
        System.out.println("\n***rupees,dollars and of Bank Account***");
        obj1.rupees();
        obj1.dollars();
        obj1.pounds();
        System.out.println("\n***rupees,dollars and of Bank Account on Interface reference***");
        obj2.rupees();
        obj2.dollars();
        obj2.pounds();
    }
    
}
