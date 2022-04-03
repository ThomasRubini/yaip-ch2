package ex8.part1;

public class TestMyIntStack {
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
