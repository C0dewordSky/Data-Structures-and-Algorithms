

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

	public boolean push(int item){

		if(isFull()){
			System.out.println("Stack is full");
			return false;
		}

		ptr++;
		data[ptr] = item;
		return true;
	}

	public boolean isFull() {
		return ptr == data.length-1; // stack will only be full when
		                             // the value of pointer is greater than the passed size
	}

	//Delete i.e POP

	public int pop() throws StackException{
		if(isEmpty()){
		throw new StackException("Cannot pop from an empty stack");
		}


		return data[ptr--];
	}

	public boolean isEmpty() {
		return ptr == -1;
	}

	//Peek or finding out the element at the top of the stack

	public int peek() throws StackException{

		if(isEmpty()){
			throw new StackException("Cannot peek from an empty stack");
		}
		return data[ptr];
	}

	public void display() throws StackException{
		if(isEmpty()){
			throw new StackException("The stack is empty");
		}

		for(int i=data.length-1;i>=0;i--){
			System.out.println(i +". " + data[i]);
		}
		System.out.println();
	}

}
