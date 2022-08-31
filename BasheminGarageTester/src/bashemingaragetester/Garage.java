/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bashemingaragetester;

/**
 *
 * @author TALHA
 */
public class Garage {
    private Car[] parking; 
    private int carsParked; 
    public Garage()
    {
        this.carsParked = 0;

        this.parking = new Car[10];
    }
    public int getCarsParked()
    {
        return carsParked;
    }
    public String arrive(Car car)
    {
        if (getCarsParked() == 10)
        {
            return "Sorry " + car.getLicense() + ", but you can't park here. GARAGE IS FULL!";
        }
        else if (getCarsParked() < 10)
        {
            parkCar(car); 
        }
        return "The car " + car.getLicense() + " is now parked.";
    }
    public void parkCar(Car car)
    {
        this.parking[getCarsParked()] = car; 
        this.carsParked += 1; 
    }
    public String depart(Car car)
    {
        for (int i = 0; i < 10; i++) 
        {
            if(this.parking[i] == car) 
            {
                this.parking[i] = null; 
                for (int j = i + 1; j < 10; j++)
                {
                    if (this.parking[j] != null)
                    {
                        this.parking[j - 1] = this.parking[j]; 
                        this.parking[j - 1].incrementMoved(); 
                        this.parking[j] = null; 
                    }
                }
                this.carsParked -= 1; 
                return car.getLicense() + " just left. It has been moved " + car.getMoved() + " times.";
            }
        }

        return "";
    }
    public void printGarage()
    {
        System.out.println("-----------------------");
        System.out.println("| # | License | Moved |");
        System.out.println("-----------------------");

        for (int i = 0; i < 10; i++)
        {
            if(this.parking[i] == null)
            {
                System.out.println("| " + i + " | VACANT | N/A |");
            }
            else
            {
                System.out.println("| " + i + " | " + this.parking[i].getLicense() + " |  " +
                        this.parking[i].getMoved() + "  |");
            }
        }
        System.out.println("-----------------------");
    }
}

