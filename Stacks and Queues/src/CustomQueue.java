public class CustomQueue {

	protected int[] data;
	private static final int DEFAULT_SIZE = 10;

	int end = 0;

	public CustomQueue(){
		this(DEFAULT_SIZE);
	}

	public CustomQueue(int size) {
		this.data = new int[size];
	}


	public boolean push(int item) throws QueueException{

		if(isFull()){
     	throw new QueueException("Stack is full");
     }


     data[end] = item;
		end++;
     return true;

	}

	public void display(){

		for (int i = 0; i < end; i++) {
			System.out.print(data[i] + " <- ");
		}
		System.out.println("END");
	}

	public int pop() throws QueueException{
		if(isEmpty()){
			throw new QueueException("Cannot pop from an empty stack");
		}

		int removed = data[0];

		for (int i = 1; i < end; i++) {
			data[i-1] = data[i];
		}
		end--;
		return removed;
	}


	public boolean isFull(){
		return end == data.length;
	}

	public boolean isEmpty(){
		return end == -1;
	}


}
