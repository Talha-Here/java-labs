/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author TALHA
 */
public class RestaurantBillingSystem implements ActionListener
{
   JFrame f;
   JCheckBox c1,c2,c3,c4;
   JLabel l1;
   JButton b1;
   int n1 ;

public RestaurantBillingSystem()
{
    
    f = new JFrame();
    l1 = new JLabel("FOOD ORDER");
    c1 = new JCheckBox("Burger");
    c2 = new JCheckBox("Roll");
    c3 = new JCheckBox("Pizza");
    c4 = new JCheckBox("Fries");
    b1 = new JButton("ORDER");
    
    
    l1.setBounds(30,50,100,50);
    c1.setBounds(100,100,100,30);
    c2.setBounds(100,150,100,30);
    c3.setBounds(100,200,100,30);
    c4.setBounds(100,200,100,30);
    b1.setBounds(200,350,100,30);
    
    
    f.add(l1);
    f.add(c1);
    f.add(c2);
    f.add(c3);
    f.add(c4);
    f.add(b1);
    
    f.setSize(900,700);
    f.setLayout(null);
    f.setVisible(true);
    
    b1.addActionListener((ActionListener) this);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
    c1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            String str=JOptionPane.showInputDialog(c1, "How many quantity you want?");
            n1 = Integer.parseInt(str);
        } 
    });
    
           
    c2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            String str=JOptionPane.showInputDialog(c1, "How many quantity you want?");
            n1 = Integer.parseInt(str);
        } 
    });
    
    c3.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            String str=JOptionPane.showInputDialog(c1, "How many quantity you want?");
            n1 = Integer.parseInt(str);
        } 
    });
    
    
    
    
 
    
}
public void actionPerformed(ActionEvent e)
{
    int amount1 = 0,amount2 = 0,amount3 = 0,amount4 = 0;
    String msg1=" ",msg2=" ",msg3=" ",msg4=" ";
    
    if (c1.selected())
   
    
}





public static void main(String args[])
{
    new RestaurantBillingSystem();
    
}
}
