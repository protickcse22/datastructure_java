import java.util.Scanner;
import java.util.Stack;

import javax.crypto.Cipher;

class StackImp<T> {
	int top;
	int size;
	T arr[];
	@SuppressWarnings("unchecked")
	public StackImp(int size) {
		this.size = size;
		arr = (T[]) new Object[size];
		this.top = -1;
	}
	public void push(T obj) {
		if (isFull())
			System.out.println("Stack is overflow");
		else {
			top = top + 1;
			arr[top] = obj;

		}
	}
	public T pop() {
		if (isEmpty()) {
			System.out.println("Stack is underflow");
			return null;

		}

		T item = arr[top--];
		return item;

	}

	public T peek() {
		if (isEmpty())
			return null;
		return arr[top];

	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top + 1 == size;
	}
}

public class StackImplementation {

	@SuppressWarnings("null")
	/*public static boolean checkbalance(String input){
		
		Stack<Character> s = new Stack<Character>();
		
		if (input.length() == 0) return false;
//		StackImp<Character> s = new StackImp<Character>(input.length());
		for (int i=0; i<input.length();i++){
			if ((input.charAt(i) == '(') || (input.charAt(i) == '{') || (input.charAt(i) == '['))
				s.push(input.charAt(i));
			else if (s.isEmpty()) return false;
			else if((s.peek() == '(') && input.charAt(i)!= ')') return false; 
			else if((s.peek() == '{') && input.charAt(i)!= '}') return false;
			else if((s.peek() == '[') && input.charAt(i)!= ']') return false;
			else s.pop();
			
		}
		if (s.isEmpty()) return true;
		
		return false;
		
	}*/
	static Scanner cin = new Scanner(System.in);

	public static void main(String[] args) {

		String str;
		System.out.println("Insert input");
		str = cin.next() ;
		/*if (checkbalance(str)){
			System.out.println("Balance");
		}
		else{
			System.out.println("Not Balance");
		}*/


	}

}
