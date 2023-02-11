

public class CustomStack {

	protected int[] data;
	private static final int DEFAULT_SIZE = 10;

	int ptr = -1;

	public CustomStack() { //When nothing is passed to you we want it to use the default size
		this(DEFAULT_SIZE);// this keyword is used here to call the constructor
	}

	public CustomStack(int size) {
		this.data = new int[size];   //To increase the default size of the stack
	}

	//Insert i.e. Push

	private boolean push(int item) throws StackException{

		if(isFull()){
			throw new StackException("Cannot push in an empty stack");
		}

		ptr++;
		data[ptr] = item;
		return true;
	}

	private boolean isFull() {
		return ptr == data.length-1; // stack will only be full when
		                             // the value of pointer is greater than the passed size
	}

	//Delete i.e POP

	private int pop() throws StackException{
		if(isEmpty()){
		throw new StackException("Cannot pop from an empty stack");
		}

		ptr--;
		int remove = data[ptr];
		return remove;
	}

	private boolean isEmpty() {
		return ptr == -1;
	}

	//Peek or finding out the element at the top of the stack

	private int peek() throws StackException{

		if(isEmpty()){
			throw new StackException("Cannot peek from an empty stack");
		}
		return data[ptr];
	}

}
