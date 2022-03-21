package ex8.part1;

import java.util.Arrays;

public class MyIntStack {
	private int[] contents;
	private int tos;

	public MyIntStack(int capacity){
		contents = new int[capacity];
		tos = -1;
	}

	public void push(int element){
		contents[++tos] = element;
	}

	public void push_a(int element){
		if(contents.length>tos+1){
			contents[++tos] = element;
		}else throw new IllegalStateException("Stack is full !");
	}

	public boolean push_b(int element){
		if(contents.length>tos+1){
			contents[++tos] = element;
			return true;
		}else return false;
	}

	public void push_c(int element){
		if(contents.length<=tos+1){
			contents = Arrays.copyOf(contents, tos+2);
		}
		contents[++tos] = element;
	}

	public int pop(){
		return contents[tos--];
	}

	public int peek(){
		return contents[tos];
	}

	public boolean isEmpty(){
		return tos < 0;
	}

	public boolean isFull(){
		return tos == contents.length - 1;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<=tos;i++)sb.append(", ").append(contents[i]);
		return "MyIntStack[capacity=%s,contents=[%s]]".formatted(contents.length, sb.substring(2));
	}

	public static void main(String[] args){
		MyIntStack stack = new MyIntStack(5);
		stack.push(1);
		stack.push(5);

		System.out.println(stack);
		stack.push(2);
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack);

		System.out.println("---");

		stack = new MyIntStack(1);
		stack.push(5);
		System.out.println(stack);
		if(!stack.push_b(2)){
			System.out.println("The stack is full !");
		}
		stack.push_c(2);
		System.out.println(stack);
	}

}
