/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editor;
import java.util.*;
/**
 *
 * @author TALHA
 */
public class Editor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Buffer1 buffer = new Buffer1();
	// Buffer2 buffer = new Buffer2();
	Scanner sc = new Scanner(System.in);
	
	System.out.println("This is a simple text editor.\n\n"
				+ "\t- '*' represents the location of the cursor.\n"
				+ "\t- Type any character and press enter to add it to the stream.\n"
				+ "\nThe following is a list of commands. "
				//+ "\n\n\t+C\tAdd a special character (C) to the stream."
				+ "\n\t-\tRemove a character from the stream."
				+ "\n\t?\tGet information about the stream (i.e., the size)."
				+ "\n\t!\tQuit the text editor"
				+ "\n\t<#\tMove the cursor left by (#) number of places."
				+ "\n\t>#\tMove the cursor right by (#) number of places.\n\n");
	while (true) {
		// System.out.println("\t" + buffer); // this is for buffer2
		System.out.println(Arrays.toString(buffer.stack1.toArray()) + "*" + Arrays.toString(buffer.stack2.toArray())); // This is for buffer 1
		System.out.print(">");
		char c = '\0';
		String s = "";
		if (sc.hasNextLine()) {
			s = sc.nextLine();
			c = s.charAt(0);
		}
		switch (c) {
			case '-':
				buffer.delete();
				break;
			case '?':
				System.out.println(buffer.size());
				break;
			case '!':
				System.out.println("Quitted the text editor.");
				sc.close();
				return;
			case '<':
				int arg = new Integer(s.substring(1, s.length()));
				buffer.left(arg);
				break;
			case '>':
				arg = new Integer(s.substring(1, s.length()));
				buffer.right(arg);
				break;
//			case '\0':
//				System.out.println("End of input");
//				return;
//			case '+':
//				c = s.charAt(1);
			default:
				buffer.insert(c);
				break;
		}	
	}
	
}
}
