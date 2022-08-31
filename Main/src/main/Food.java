/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author TALHA
 */
public class Food {
     String burger="burger";
	int h1;//number of burgers
	 String fries ="fries";
	 int c1; // number of fries
	 String tikka="tikka";
	 int t1;//number of tikkas
	 String chickenrolls="chicken rolls";
	 int CH1;//number of chicken rolls
	 String icecream_sundae="icecream_sundae";
	 int s1;//the number of sundaes
	 String cola="coke";
	 int c2;//number of cola
	 String jucie="juice";
	 int j1; // the number of juice
	 String nuggets="nuggets";
	 int CH2;//number of chicken nuggets
	 //The price of various foods
	 int priceh1=200;//the price of burger
	 int pricec1=50;//fries price
	 int pricet1=180;//price of tikka
	 int priceCH1=120;//price of chicken rolls
	 int prices1=100;//the price of the icecream_sundae
	 int pricec2=60;//Coke price
	 int pricej1=80;//the price of juice
	 int priceCH2=35;// chicken nuggets price
	
	 //Package purchase
	 String SectionA="Package A"; //"burger + Coke + French Fries";
	 String SectionB="Package B"; //"Chicken Roll + Coke + French Fries";
	 String SectionC="Package C"; // "Burger + Chicken Roll + tikkas";
	 String SectionD="Package D"; //"Chicken Roll + Fries + Juice";
	int priceA=290;
	int priceB=200;
	int priceC=450;
	int priceD=220;
	
	 // Define a menu
	public void show() {
		 System.out.println("Burger @ Rs.200");
		 System.out.println("Fries @ Rs.50");
		 System.out.println("Tikka @ Rs.180");
		 System.out.println("Chicken roll @ Rs.120");
		 System.out.println("IceCream Sundae @ Rs.100");
		 System.out.println("Coke @ Rs.60");
		 System.out.println("Juice @ Rs.80");
		 System.out.println("Nuggets @ Rs.200");
	}
}
