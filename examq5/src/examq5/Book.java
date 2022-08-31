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
public class Book {
    private int ID;
    private String author;
    private String title;
    private double price;
    private int publishingYear;
    private int quantityAvailable;


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    public void setQuantityAvailable(int quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    public void purchase(int quantity){
        if(quantity<quantityAvailable){
            this.quantityAvailable-=quantity;
            System.out.println("Quantity required : "+quantity);
            System.out.println("Quantity Updated : "+ this.quantityAvailable);
        }else{
            System.out.println("Quantity required not available");
        }
    }
}

