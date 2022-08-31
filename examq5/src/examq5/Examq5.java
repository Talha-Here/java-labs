/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examq5;

/**
 *
 * @author TALHA
 */
public class Examq5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              Book book = new Book();
        book.setID(114);
        book.setAuthor("Khaled Hosseini");
        book.setTitle("The Kite Runner");
        book.setPrice(1200);
        book.setPublishingYear(2003);
        book.setQuantityAvailable(500);


        System.out.println("ID : "+book.getID());
        System.out.println("Author : "+ book.getAuthor());
        System.out.println("Title : "+ book.getTitle());
        System.out.println("Price : "+ book.getPrice());
        System.out.println("Publishing year : "+ book.getPublishingYear());
        System.out.println("Quantity available : "+ book.getQuantityAvailable());
        book.purchase(114);
        book.purchase(114);

    }
}
    
    

