/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bashemingaragetester;
import java.util.*;
import java.io.*;
/**
 *
 * @author TALHA
 */
public class BasheminGarageTester {
    public static void main(String[] args) throws IOException {
        Garage bashemin = new Garage();
       int lines = 0; 
        Scanner garageScannerCounter = new Scanner(new File("E:/garage.txt"));

        while (garageScannerCounter.hasNextLine()) 
        {
            garageScannerCounter.nextLine();
            lines++; 
        }
        Car[] tempCars = new Car[lines]; 
        Scanner garageScanner = new Scanner(new File("E:/garage.txt"));
        int lastIndex = 0; 
        while (garageScanner.hasNext()) {
            String license = garageScanner.next(); 
            garageScanner.next(); 
            for (int i = 0; i < lines; i++) {
                if (tempCars[i] == null) 
                {
                    tempCars[i] = new Car(license); 

                    lastIndex = i;

                    break;  
                } else if (tempCars[i].getLicense().equals(license)) 
                {

                    break;

                }
            }
        }
        Car[] cars = new Car[lastIndex + 1];
        for (int i = 0; i <= lastIndex; i++) {
            cars[i] = tempCars[i];
        }
        Scanner garageFile = new Scanner(new File("E:/garage.txt"));
        PrintWriter toFile = new PrintWriter("E:/output.txt");
        while (garageFile.hasNext()) { 
            String license = garageFile.next(); 
            String action = garageFile.next();
            int carIndex = getCarIndex(license, cars);
            if (action.equals("ARRIVE")) 
            {
                toFile.println(bashemin.arrive(cars[carIndex])); 
            } else if (action.equals("DEPART")) 
            {
                toFile.println(bashemin.depart(cars[carIndex])); 
            }
            bashemin.printGarage(); 
        }
        toFile.close(); 
    }
    public static int getCarIndex(String license, Car[] cars) {
        for (int i = 0; i < 15; i++) {
            if (license.equals(cars[i].getLicense())) {
                return i;
            }
        }
        return -1;
    }
}
   
    

