
public class Main {

	public static void main(String[] args) throws StackException {

		CustomStack stack = new CustomStack(5);

		stack.push(7);
		stack.push(18);
		stack.push(16);
		stack.push(69);
		stack.push(6);
		//stack.push(78);
		stack.display();
		System.out.println(stack.pop());
		stack.display();
	//	System.out.println(stack.peek());


	//	DynamicStack dstack = new DynamicStack(5);

	//	dstack.push(7);
	//	dstack.push(18);
		//dstack.push(16);
		//dstack.push(69);
		//dstack.push(6);
		//dstack.push(78);
	//	System.out.println(dstack.pop());
	//	System.out.println(dstack.peek());


	}
}
