package ch04;

import ch02.MyArray;

public class MyArrayStack {
		
		MyArray arrayStack;
		int top;
		
		public MyArrayStack() {
			top = 0;
			arrayStack = new MyArray();
		}
		
		public MyArrayStack(int size) {
			top = 0;
			arrayStack = new MyArray(size);
		}
		
		public void push(int data) {
			if( isFull()) {
				System.out.println("Stack is full");
				return;
			}
			arrayStack.addElement(data);
			top++;
		}
		
		public int pop() {
			if (isEmpty()) {
				System.out.println("Stack is Empty");
				return MyArray.ERROR_NUM;
			}
			return arrayStack.removeElement(--top);
		}
		
		public int Peek() {
			if (isEmpty()) {
				System.out.println("Stack is Empty");
				return MyArray.ERROR_NUM;
			}
			return arrayStack.getElement(top-1);
		}
		
		public boolean isFull() {
			if (top == arrayStack.ARRAY_SIZE) {
				return true;
			}
			else return false;
		}
		
		public boolean isEmpty() {
			if (top == 0) {
				return true;
			}
			else return false;
		}
		
		public void printAll() {
			arrayStack.printAll();
		}
}
