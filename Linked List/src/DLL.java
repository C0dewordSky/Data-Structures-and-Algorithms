public class DLL {

	private class Node {
		int data;
		Node next;
		Node prev;

		public Node(int data) {
			this.data = data;
		}

		public Node(int data, Node next, Node prev) {
			this.data = data;
			this.next = next;
			this.prev = prev;
		}
	}

	private Node head;
	private Node tail;
	private int size;


	public void insertFirst(int val) {
		Node node = new Node(val);
		node.next = head;
		node.prev = null;
		if (head != null) {
			head.prev = node;
		}
		head = node;
	}

	public void display() {
		Node temp = head;

		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
			//size++;
		}
		System.out.println("END");

	}

	public void revDisplay() {
		Node temp = head;
		Node last = null;


		while (temp != null) {
			last = temp;
			temp = temp.next;
		}
		while (last != null) {
			System.out.print(last.data + " -> ");
			last = last.prev;
		}
		System.out.println("Head");
	}

	public void removeLast() {
		Node temp = head;
		Node last = null;

		while (temp != null) {
			last = temp;
			temp = temp.next;
		}
		last = last.prev;
		last.next = null;

	}

	public void addLast(int data){
		Node node = new Node(data);
		Node temp = head;
		Node last = null;

		while(temp!=null){
			last = temp;
			temp = temp.next;
		}

		last.next = node;
		last = node;
		last.prev = temp;


	}


}
