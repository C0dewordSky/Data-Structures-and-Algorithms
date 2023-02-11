public class LL {

	private class Node {

		private int data;
		 private Node next;

		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}

		public Node(int data) {
			this.data = data;
		}
	}

	public Node head;
	public Node tail;
	public int size;



	public void insertFirst(int val){
		Node node = new Node(val);
		node.next = head;
		head = node;

		if(tail == null){
			tail = head;
		}

		size += 1;
	}

	public void display(){
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println("END");
	}

	public void insertLast(int val){
		Node node = new Node(val);
		tail.next = node;
		tail = node;

		if(head == null){
			head=tail=node;
		}
	}

	public void insertMid(int data, int index){

		if(index == 0){
			insertFirst(data);
			return;
		}

		if(index == size){
			insertLast(data);
			return;
		}

		Node temp = head;
		for(int i=1;i<index;i++){
			temp = temp.next;
		}

		Node node = new Node(data, temp.next);
		temp.next = node;
		size++;
	}

	public int getSize(){
		int size = 0;
		Node temp = head;
		Node node = new Node(size);

		while(temp != null){
			temp = temp.next;
			size++;
		}
		System.out.println(size);
         return size;
	}

	public void removeFirst(){
		Node temp = head;
		temp = temp.next;
		head = temp;
	}

	public void removeLast(){
		if(size==0){
			System.out.println("LL is empty");
		}
		Node temp = head;
		for(int i=0;i<size-2;i++){
			temp = temp.next;
		}
		tail = temp;
		temp.next = null;

	}

	public int  searchVal(int key){
		int index = 0;
		Node temp = head;

		while(temp != null){
			if(temp.data == key) {
				System.out.println(index);
				return index;
			}
				temp = temp.next;

			index++;
		}
		System.out.println(-1);
		return -1;
	}

	public void removeDuplicate(){
		Node temp = head;

		while(temp.next != null){
			if(temp.data == temp.next.data){
				temp.next = temp.next.next;
				size--;
			}else{
				temp = temp.next;
			}
		}
		tail = temp;
		temp.next = null;
	}
	}

