import java.util.Stack;

public class StackDemo {
	
	public static void main(String[] args) {
		
		
		Stack<String> stack1=new Stack<String>();
		
		stack1.push("Line 1");
		stack1.push("Value 2");
		
		System.out.println("\n\n-------Example 1");
		
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		
		
		System.out.println("\n\n-------Example 2");
		
		Stack<Integer> stack2=new Stack<Integer>();
		stack2.push(1);
		stack2.push(2);
		stack2.push(3);
		stack2.push(4);
		stack2.push(5);

		System.out.println("Peeking :" + stack2.peek());
		
		
		while(!stack2.empty()) {
			System.out.println("Poppping :" + stack2.pop());
		}
		
		
		
		
		
	}

}
