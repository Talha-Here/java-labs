/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TALHA
 */
import java.util.*;
public class Food {
    public String Name;
	public float Price;
	public Food() {	
	}
	public Food(String Name, float Price) {
		this.Name=Name;
		this.Price=Price;
	}
	public void input() {
		Scanner bp=new Scanner(System.in);
		System.out.println("Enter name food ");
		Name=bp.nextLine();
		System.out.println("Enter Price food ");
		Price=bp.nextFloat();
	}
	public void Payment() {
		System.out.println(" Price: "+Price);
	}
	public String detail() {
		return Name+" "+Price;
	}
	public float getPrice(){
		return Price;
	}
	
	public String getName(){
		return Name;
	}
	public void setName(String Name) {
		this.Name=Name;
	}
	public void setPrice(Float Price) {
		this.Price=Price;
	}	
        
}
