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
public class Buffer1 {
    Stack<Character> stack1;
	Stack<Character> stack2;
	// create an empty buffer
	public Buffer1() {
		stack1 = new Stack<Character>();
		stack2 = new Stack<Character>();
	}
	// insert c at the cursor position
	public void insert(char c) {
		stack1.push(c);
	}
	// character at the cursor position
	public char get() {
		return stack1.peek();
	}
	// delete and return the character at the cursor
	// left delete, more like backspace
	public char delete() {
		return stack1.pop();
	}
	// move the cursor k positions to the left
	public void left(int k) {
		// assuming no stackoverflow
		for (int i = 0; i < k; i++) {
			stack2.push(stack1.pop());
		}
	}
	// move the cursor k positions to the right
	public void right(int k) {
		for (int i = 0; i < k; i++) {
			stack1.push(stack2.pop());
		}
	}
	// number of characters in the buffer
	public int size() {
		return stack1.size() + stack2.size();
	}
}
