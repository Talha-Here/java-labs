/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.*;
import java.text.SimpleDateFormat;//The java.text.SimpleDateFormat class provides methods to format and parse date and time in java. The SimpleDateFormat is a concrete class for formatting and parsing date which inherits java.text.DateFormat class.
/**
 *
 * @author TALHA
 */
public class Main extends Food implements Buyways {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Main myRestaurant=new Main();
		myRestaurant.menu();
    }
    @Override
    public void normal() {
		try {
			// TODO Auto-generated method stub	
			 System.out.println("Please enter the order information below");
                         System.out.println("Enter the name of the Food OR Drink from the Menu:");
			while(true) {
				Scanner sc=new Scanner(System.in);
				String od=sc.nextLine();                               
				switch(od) {
				 case "burger":
					System.out.println("Please enter the number of burgers:");
					h1=sc.nextInt();
					System.out.println("Please continue to order, if finished, please enter finish to finish ordering ^_^~");
					continue;
				 case "fries":
					 System.out.println("Please enter the number of fries:");
					c1=sc.nextInt();
					 System.out.println("Please continue to order, if finished, please enter finish to finish ordering ^_^~");
					continue;
				 case"tikka":
					 System.out.println("Please enter the number of tikkas:");
					t1=sc.nextInt();
					 System.out.println("Please continue to order, if finished, please enter finish to finish ordering ^_^~");
					continue;
				 case "chicken roll":
					 System.out.println("Please enter the number of chicken rolls:");
					CH1=sc.nextInt();
					 System.out.println("Please continue to order, if finished, please enter finish to finish ordering ^_^~");
					continue;
				 case"icecream":
					 System.out.println("Please enter the number of icecream_sundaes:");
					s1=sc.nextInt();
					 System.out.println("Please continue to order, if finished, please enter finish to finish ordering ^_^~");
					continue;
				 case "coke":
					 System.out.println("Please enter the number of cokes:");
					c2=sc.nextInt();
					 System.out.println("Please continue to order, if finished, please enter finish to finish ordering ^_^~");
					continue;
				 case "juice":
					 System.out.println("Please enter the number of juices:");
					j1=sc.nextInt();
					 System.out.println("Please continue to order, if finished, please enter finish to finish ordering ^_^~");
					continue;
				 case "nuggets":
					 System.out.println("Please enter the number of nuggets:");
					CH2=sc.nextInt();
					 System.out.println("Please continue to order, if finished, please enter finish to finish ordering ^_^~");
					continue;
				case"finish":	
					SimpleDateFormat df = new SimpleDateFormat("HH:mm");
					Date nowTime =null;
					Date beginTime = null;
					Date endTime = null;
					try {
						nowTime = df.parse(df.format(new Date()));
						beginTime = df.parse("12:00");
						endTime = df.parse("14:00");
					}catch(Exception e) {
						e.printStackTrace();
					}
					boolean flag = belongCalendar(nowTime, beginTime, endTime);
					if(flag) {
						System.out.println("noon meal 20% off");
						double sumprice=(h1*priceh1+c1*pricec1+t1*pricet1+CH1*priceCH1+s1*prices1+c2*pricec2+j1*pricej1+CH2*priceCH2)*0.8;
						 System.out.println("Acceptable:"+sumprice);
                                                 System.out.println("Enter your amount:");
						int deserveprice=sc.nextInt();                                               
						 System.out.println("Receipt:"+deserveprice);
						 System.out.println("Change: "+(deserveprice-sumprice));
                                                 System.out.println("order ending");
						break;
					}else {
						int sumprice=h1*priceh1+c1*pricec1+t1*pricet1+CH1*priceCH1+s1*prices1+c2*pricec2+j1*pricej1+CH2*priceCH2;
						 System.out.println("Acceptable:"+sumprice);
                                                 System.out.println("Enter your amount:");
						 int deserveprice=sc.nextInt();
						 System.out.println("Receipt:"+deserveprice);
						 System.out.println("Change: "+(deserveprice-sumprice));
                                                 System.out.println("order ending");
						break;
					}		
				}
                                
				//sc.close();
				System.out.println("----------------------------------------------");
				menu(); //End of order Return to menu	
                                //break;
			}	
			
		}catch(InputMismatchException e) {

        System.out.println("Input exception, please enter correctly");
		}
	
	}
	 // function used to determine whether the current time period is
	private boolean belongCalendar(Date nowTime, Date beginTime, Date endTime) {
		// TODO Auto-generated method stub
		 Calendar date = Calendar.getInstance();//Set the current time
	    date.setTime(nowTime);
 
	     Calendar begin = Calendar.getInstance();//Set the start time
	    begin.setTime(beginTime);
 
	     Calendar end = Calendar.getInstance();//Set end time
	    end.setTime(endTime);
 
	    if (date.after(begin) && date.before(end)) {
	        return true;
	    } else {
	        return false;
	    }
	}
 
    @Override
	 	public void set(){
		try {
			// TODO Auto-generated method stub
			 System.out.println("Welcome, please choose the package you want");
			 System.out.println("DEAL 1: Burger + Coke + French Fries");
			 System.out.println("DEAL 2: Chicken Roll + Coke + French Fries");
			 System.out.println("DEAL 3: Burger + Chicken Roll + Egg Tart");
			 System.out.println("DEAL 4: Chicken Roll + French Fries + Juice");
			
			while(true) {
				Scanner sc1=new Scanner(System.in);
                                System.out.println("Enter your DEAL:");
				String od1=sc1.nextLine();
				switch(od1) {
				 case "deal 1":
					 System.out.println("Please continue to order, if finished, please enter finish to finish ordering ^_^~");
					 System.out.println("Acceptable:"+priceA);
                                         System.out.println("Enter your amount:");
					int deserveprice=sc1.nextInt();
					 System.out.println("Receipt:"+deserveprice);
					System.out.println("Change: " +(deserveprice-priceA));
					continue;
				 case "deal 2":
					 System.out.println("Please continue to order, if finished, please enter finish to finish ordering ^_^~");
					 System.out.println("Acceptable:"+priceB);
                                         System.out.println("Enter your amount:");
					int deserveprice1=sc1.nextInt();
					 System.out.println("Receipt: "+deserveprice1);
					 System.out.println("Change: "+(deserveprice1-priceB));
					continue;
				 case "deal 3":
					 System.out.println("Please continue to order, if finished, please enter finish to finish ordering ^_^~");
					 System.out.println("Acceptable:"+priceC);
                                         System.out.println("Enter your amount:");
					int deserveprice2=sc1.nextInt();
					 System.out.println("Receipt: "+deserveprice2);
					 System.out.println("Change: "+(deserveprice2-priceC));
					continue;
				 case "deal 4":
					 System.out.println("Please continue to order, if finished, please enter finish to finish ordering ^_^~");
					 System.out.println("Acceptable:"+priceD);
                                         System.out.println("Enter your amount:");
					int deserveprice3=sc1.nextInt();
					 System.out.println("Receipt:"+deserveprice3);
					 System.out.println("Change: "+(deserveprice3-priceD));
					continue;
				case"finish":
					 System.out.println("order ending");
					break;
				}
				//sc1.close();
				System.out.println("----------------------------------------------");
				 menu();//End of order Return to menu
                                 
			}
		}catch(InputMismatchException e) {
			 System.out.println("Input exception, please enter correctly");
		}
					
	}
	 //Menu function Used to display menu information and select the purchase method
	public void menu() {
		try {
			 System.out.print ("Welcome to TAT ordering system~");
			
			 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//Set date format
			System.out.println(df.format(new Date()));// new Date() is to get the current system time
			
			 System.out.println("Good news: 20% discount on dining at 12:00~14:00");
			
			 show();//call the display function defined in the Food class to display the menu information
			 System.out.println("1. Normal purchase\n2. Package purchase");
			Scanner sc2= new Scanner(System.in);
                        System.out.println("Enter your purchase #: ");
			int order=sc2.nextInt();
			if(order==1) {
				normal();
			}
			if(order==2) {
				set();
			}
			//sc2.close();
		}catch(InputMismatchException e) {
			 System.out.println("Input exception, please enter correctly");
		}
	}
   
}
