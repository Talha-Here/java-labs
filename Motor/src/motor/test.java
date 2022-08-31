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
public class test {
    public static void main(String[] args) {
        Motor m1 = new Motor(5.5,135.25);
        MonoBlock b1 = new MonoBlock(300,"field values of a Motor");
        System.out.println(m1); 
        System.out.println(b1);
    }
}
