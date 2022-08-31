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
public class Car {

    private String license; 
    private int moved;  
    public Car(String license)
    {
        this.license = license;
        this.moved = 0;
    }
    public String getLicense()
    {
        return this.license;
    }
    public void setLicense(String license)
    {
        this.license = license;
    }
    public int getMoved()
    {
        return this.moved;
    }
    public void setMoved(int moved)
    {
        this.moved = moved;
    }
    public void incrementMoved()
    {
        this.moved += 1;
    }
}

