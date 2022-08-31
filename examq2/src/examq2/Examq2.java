/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examq2;

/**
 *
 * @author TALHA
 */
//public class Examq2 {

    /**
     * @param args the command line arguments
     */

//package stackProblems;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class AppDelStack{
    public int opType;
    public String val;
}
public class Examq2 {
    static Stack<AppDelStack> oprationSt = new Stack<AppDelStack>();
    static Stack<Character> st = new Stack<Character>();
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int op;
        int k;
        for(int i = 0; i<t;i++){
            op = sc.nextInt();
           // opDecider(op);
           if(op == 1){ 
              String s = sc.next();
               if(sc.hasNextLine()){
                  sc.nextLine();
               }
           appendOPD(s);
           }else {
              //  if(sc.hasNextLine() ){
              //    k = sc.nextInt();
              ///}
               
                if(op == 2){  
                    k = sc.nextInt();
                  deleteOPD(k);
                 }else if(op == 3){
                    k = sc.nextInt();
                  printOPD(k);
                 }else{
                    undoOPD();
                }
           
           }
      
       
    }
    }
   
   
    public static void undoOPD(){
        AppDelStack apdel = oprationSt.pop();
        if(apdel.opType == 1){
            for(int i=0;i<Integer.valueOf(apdel.val);i++){
                st.pop();
            }
        }else {
             for(int i=0;i<apdel.val.length();i++){
                st.push(apdel.val.charAt(i));
            }
        }
    }
    public static void printOPD(int k){
        Stack<Character> tempst = new Stack<Character>();
       
     //  System.out.println("stack size "+st.size());
        for(int i=st.size();i>k;i--){
            tempst.push(st.pop());
        }
         System.out.println(st.peek());
        while(!tempst.isEmpty()){
            st.push(tempst.pop());
        }
       
      
    }
    public static void appendOPD(String s){
        for(int i=0;i<s.length();i++){
         st.push(s.charAt(i));  
        }
        AppDelStack apdel = new AppDelStack();
        apdel.opType = 1;
        apdel.val = String.valueOf(s.length());
        oprationSt.push(apdel);
    }
   
    public static void deleteOPD(int k){
        StringBuilder sb = new StringBuilder();
        for(int i= 0;i<k;i++){
            sb.append(st.pop());
        }
         AppDelStack apdel = new AppDelStack();
        apdel.opType = 2;
       
        apdel.val = sb.reverse().toString();
        oprationSt.push(apdel);
    }
   
}


    
