/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motor;

/**
 *
 * @author TALHA
 */
public class Motor {

    /**
     * @param args the command line arguments
     */
        double horsePower;
        double price;
        Motor(double horsePower,double price){
        this.horsePower = horsePower;
        this.price = price;
    }
        @Override
      public String toString(){
          return horsePower+" "+price;
      }         
    }
    
