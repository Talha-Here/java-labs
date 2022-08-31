/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;
import java.util.*;
/**
 *
 * @author TALHA
 */
public class Accounts {

    /**
     * @param args the command line arguments
     */
    protected static String username,password;
static Teacher T=new Teacher("TalhaTHK","Talha","Mustafa","Computer Engineering",50,48);
public void Show_attendence(){
}
static students S=new students("AliAK","Ali","Khan","Electrical Engineering",50,37); 
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
Accounts a1=new Accounts();
        int count=1;
                for(int i =0 ; i<count;i++){
        System.out.println(" For Student Press 1");
        System.out.println(" For Teacher Press 2");
        System.out.println(" For Admin   Press 3");

int A=sc.nextInt();
switch(A){
case 1:
System.out.println("Press 1: For Show_Attendence()");
System.out.println("Press 2: For Attempt_Quiz()");
System.out.println("Press 3: For Query()");
int B=sc.nextInt();
switch(B){
case 1:
S.Show_attendence();
break;
case 2:
S.Attempt_Quiz();  
break;
case 3:
S.Query();
break;
}
break;
case 2:
System.out.println("Press 1: For Show_Attendence()");
System.out.println("Press 2: For Create_Quiz()");
System.out.println("Press 3: For Reply_Query()");
int C=sc.nextInt();
switch(C){
case 1:
T.Show_attendence();
break;
case 2:
T.Create_Quiz();
break;
case 3:
T.Reply_Query();
break;
}
break;
case 3:
System.out.println("You dont have any Admin rights!");
break;
}

            System.out.println("Check the System Again ?");
            System.out.println("Press yes");
            String m = sc.next();
            if(m.equals("yes")){
                count +=1;
}     }  }   }
class students extends Accounts{
private String user_id,first_name,father_name,department;
private int total_working_days,presents;
String query,ans,ans1;
Teacher Te=new Teacher();
Scanner sc=new Scanner(System.in);
students(){}
students(String user_id,String first_name,String father_name,String department, int total_working_days,int presents){
this.user_id=user_id;
this.first_name=first_name;
this.father_name=father_name;
this.department=department;
this.total_working_days=total_working_days;
this.presents=presents;
}
public double calculate_attendence(){
return total_working_days-presents;
}
    @Override
public void Show_attendence(){
System.out.println("Your User ID is:"+user_id);
System.out.println("Your Name is:"+first_name);
System.out.println("Your Father name is:"+father_name);
System.out.println("Your Department  is:"+department);
System.out.println("Total working days are:"+total_working_days);
System.out.println("Your Absents are:"+calculate_attendence());
System.out.println("Your Presents are:"+presents);
}
public void Query(){
System.out.println("Enter Your Query:");
S.query=sc.nextLine();
}
public void Attempt_Quiz(){
    System.out.println("Enter Qno 1:"+T.q1);   
    System.out.print("Ans no1: ");
    S.ans=sc.nextLine();
    System.out.println("Enter Qno 1:"+T.q2);
    System.out.print("Ans no2: ");
S.ans1=sc.nextLine();
if(Te.q1!=null&&Te.q2!=null){
System.out.println(Te.q1);
System.out.println(Te.q2);
}
else{
    System.out.println("Quiz is not set by teacher");
}
} 
}
class Teacher extends Accounts{
private String user_id,first_name,father_name,department;
private int total_working_days,presents;
String q1,q2,reply;
Scanner sc=new Scanner(System.in);
static students St=new students();
Teacher(){}
Teacher(String user_id,String first_name,String father_name,String department, int total_working_days,int presents){
this.user_id=user_id;
this.first_name=first_name;
this.father_name=father_name;
this.department=department;
this.total_working_days=total_working_days;
this.presents=presents;
}  
public double calculate_attendence(){
return total_working_days-presents;
}
public void Show_attendence(){
System.out.println("Your User ID is: "+user_id);
System.out.println("Your Name is: "+first_name);
System.out.println("Your Father Name is: "+father_name);
System.out.println("Your Department  is: "+department);
System.out.println("Total working days are: "+total_working_days);
System.out.println("Your Absents are: "+calculate_attendence());
System.out.println("Your Presents are: "+presents);
}
public void Create_Quiz(){
 System.out.println("Enter Qno 1:");   
T.q1=sc.nextLine();
System.out.println("Enter Qno2: ");
T.q2=sc.nextLine();
}
public void Reply_Query(){
if(S.query.length()>1){
if(S.query!=null){
System.out.println("Student query:"+S.query);
System.out.print("Reply: ");
T.reply=sc.nextLine();
}
else{
System.out.println("No query");}
} 
else if(S.query.isEmpty()){
System.out.println("No Queries is Generated");
}  }   }
class ADMIN extends Accounts {
private String user_id,first_name,father_name,department;
private int total_working_days,presents;
ADMIN(String user_id,String first_name,String father_name,String department, int total_working_days,int presents){
this.user_id=user_id;
this.first_name=first_name;
this.father_name=father_name;
this.department=department;
this.total_working_days=total_working_days;
this.presents=presents;
}
public double calculate_attendence(){
return total_working_days-presents;
}
}

 
