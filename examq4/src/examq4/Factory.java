/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examq4;
import java.util.*;
/**
 *
 * @author TALHA
 */
public class Factory {
     public int Id;
    public String Name;
    public int Salary;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }
    
    public void Data(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your ID:");
        int id=Integer.parseInt(sc.nextLine());
        setId(id);
        System.out.println("Enter Name:");
        String name=sc.nextLine();
        setName(name);
        System.out.println("Enter your Salary:");
        int salary=sc.nextInt();
        setSalary(salary);
    }
}
 class Manager extends Factory {
    Manager(){
        super.Data();
        System.out.println("Manager Bio Data");
        System.out.println("ID:"+getId());
        System.out.println("Name"+getName());
        System.out.println("Salary:"+getSalary());       
    }
}

 class HumanResource extends Factory {
    HumanResource(){
        super.Data();
        System.out.println("Employee Data");
        System.out.println("ID:"+getId());
        System.out.println("Name"+getName());
        System.out.println("Salary:"+getSalary());
    }
}

 class Worker extends HumanResource{
    Worker(){
        Scanner sc=new Scanner(System.in);
        super.Data();
        System.out.println("Enter the number of hours:");
        int hours=sc.nextInt();       
        System.out.println("Worker Data");
        System.out.println("Manager Bio Data");
        System.out.println("ID:"+getId());
        System.out.println("Name"+getName());
        System.out.println("Salary:"+getSalary());
        System.out.println("Working hours:"+hours);
    }
}

