public class CircularQueue {

	protected int[] data;
	private static final int DEFAULT_SIZE=10;

	protected int front = 0;
	protected int end = 0;
	private int size = 0;

	public CircularQueue(int size) {
		this.data = new int[size];
	}

	public CircularQueue(){
		this(DEFAULT_SIZE);
	}


	public boolean insert(int item) {
		if(isFull()){
			return false;
		}
        data[end] = item;
		end++;
		end = end % data.length;
		size++;
		return true;

	}

	public int remove() throws CircularQueueException{

		if(isEmpty()){
			throw new CircularQueueException("Queue is EMPTY");
		}
		int remove = data[front];
		front++;
		front = front% data.length;
		size--;
		return remove;
	}

	public int front() throws CircularQueueException{

		if(isEmpty()){
			throw new CircularQueueException("Queue is empty");
		}
		return data[0];
	}

	public void display(){

		if(isEmpty()){
			System.out.println("EMPTY");
		}

		int i = front;
		do{
			System.out.print(data[i] + " <- ");
			i++;
			i%= data.length;
		}while(i!=end);
		System.out.println("END");

	}

	public boolean isFull(){
		return size == data.length;
	}

	public boolean isEmpty(){
		return size ==0;
	}
}
