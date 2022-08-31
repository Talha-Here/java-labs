/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;
import javax.swing.*;
/**
 *
 * @author TALHA
 */
public class GuessingGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int computerNumber = (int) (Math.random()*100 + 1); 
        int userAnswer = 0; 
        System.out.println("The correct guess would be " + computerNumber);
        int count = 1; 
        // Display input dialog until the user guesses the correct number 
        while (userAnswer != computerNumber)
        {
            String response = JOptionPane.showInputDialog(null,"Enter a guess between 1 and 100", "Guessing Game", 3); //initial input dialog for user
            userAnswer = Integer.parseInt(response); //convert string to int for use in check method below          
            JOptionPane.showMessageDialog(null, ""+ determineGuess(userAnswer, computerNumber, count)); 
            count++; //increment num of tries for each attempt
        }  
    }    
    //guess function for checking
    public static String determineGuess(int userAnswer, int computerNumber, int count){
        if (userAnswer <=0 || userAnswer >100) {
            return "Your guess is invalid";
        }
        else if (userAnswer == computerNumber ){
            return "Correct!\nTotal Guesses: " + count;
        }
        else if (userAnswer > computerNumber) {
            return "Your guess is too high, try again.\nTry Number: " + count;
        }
        else if (userAnswer < computerNumber) {
            return "Your guess is too low, try again.\nTry Number: " + count;
        }
        else {
            return "Your guess is incorrect\nTry Number: " + count;           
        }
    }
}
