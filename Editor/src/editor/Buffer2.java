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
public class Buffer2 {
    	Stack<Character> leftStack;
	Stack<Character> rightStack;
	boolean reverse = true;
	public Buffer2() {
		leftStack = new Stack<Character>();
		rightStack = new Stack<Character>();
	}
	public void insert(char c) {
		leftStack.push(c);
	}
	public char get() {
		return leftStack.peek();
	}
	public char delete() {
		return rightStack.isEmpty() ? '\0' : rightStack.pop();
	}
	public void left(int k) {
		while (!leftStack.isEmpty() && --k >= 0) rightStack.push(leftStack.pop());
	}
	public void right(int k) {
		while (!rightStack.isEmpty() && --k >= 0) leftStack.push(rightStack.pop());
	}
	public int size() {
		return rightStack.size() + leftStack.size();
	}
	public String serializeBuffer(Stack<Character> buffer) {
		int size = buffer.size();
		StringBuilder sb = new StringBuilder();
		if (reverse) {
			for (int i = 0; i < size; i++) {
				sb.append(buffer.get(i));
			}
			reverse = !reverse;
		} else {
			for (int i = size - 1; i >= 0; i--) {
				sb.append(buffer.get(i));
			}
			reverse = !reverse;
		}
		return sb.toString();
	}
	// '*' means the position of the cursor
            @Override
	public String toString() {
		return serializeBuffer(leftStack) + '*' + serializeBuffer(rightStack);
	}
}

