/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author TALHA
 */
public class Linkedlist {
    public static void main(String[] args) {
        	main list = new main();
		list.insert("1. Name: Talha khan|Grade: 10|Section: A");
		list.insert("2. Name: Ali|Grade: 8|Section: A");
		list.insert("3. Name: Umair|Grade: 5|Section: C"); 
                list.insert("4. Name: Saad|Grade: 8|Section: D");     
                list.insert("5. Name: Abdul|Grade: 7|Section: E");     
                list.insert("6. Name: John|Grade: 4|Section: B");     
                list.insert("7. Name: Ahmed|Grade: 2|Section: A");     
                list.insert("8. Name: Huzaifa|Grade: 9|Section: B");     
                list.insert("9. Name: Hassan|Grade: 6|Section: C");     
                list.insert("10. Name: Khurram|Grade: 5|Section: E");     
                list.show();
                System.out.println("Deleting value at index 9");
		list.deleteAt(9);
                System.out.println("List after deletion:");
		list.show();
	}
    }
        
    
    

