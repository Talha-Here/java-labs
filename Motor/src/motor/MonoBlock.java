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
public class MonoBlock {
        int pumpCapacity;
        String fields_of_a_Motor;
        MonoBlock(int pumpCapacity,String fields_of_a_Motor){
        this.pumpCapacity = pumpCapacity;
        this.fields_of_a_Motor = fields_of_a_Motor;
}
        @Override
        public String toString(){
          return pumpCapacity+" "+fields_of_a_Motor;
}
}
