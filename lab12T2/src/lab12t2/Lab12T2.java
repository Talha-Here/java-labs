/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12t2;

/**
 *
 * @author TALHA
 */
 
class student{
    String name;
    int rollno;
    String address;
    double gpa;
    student(String name, int rollno, String address, double gpa){
       this.name = name;
       this.address = address;
       this.rollno = rollno;
       this.gpa = gpa;     
    }  
}
class teacher{
    String name;
    String address;
    int telno;
    String degree; 
    teacher(String name,String address,int telno,String degree){
        this.name = name;
        this.address = address;
        this.telno = telno;
        this.degree = degree;
    }
}
class course{
    String name;    
    student std[] = new student[5];    
    teacher teach;    
    course ( String name, teacher teach, student std[] ) {        
        this.name = name;
        this.std = std;        
        this.teach = teach; }
    void printDetails() {        
        System.out.println("Course Name: "+this.name);
          System.out.println("Course Teacher: "+this.teach.name);        
    for ( int i = 0 ; i < 5 ; i++ ) {            
    System.out.println((i+1)+". "+this.std[i].name +" ("+this.std[i].rollno +")");
    }
}}

public class Lab12T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        student std[] = new student[5];        
        std[0] = new student("Faheem",136,"Johar Mor",2.9);        
        std[1] = new student("Ali",66,"Gulshan",3.6);        
        std[2] = new student("Saad",176,"Bahadurabad",2.86);        
        std[3] = new student("Faisal",172,"N Street",2.6);        
        std[4] = new student("Mujtaba",177,"Scheme33",2.8);        
        teacher teach = new teacher( "Miss Aneeta", "FB Area", 34567892, "M.S in Computer Engg" );    
        course c = new course( "OOP", teach, std );        
        c.printDetails();
    }
}
    

