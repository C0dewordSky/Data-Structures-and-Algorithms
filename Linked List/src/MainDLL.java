public class MainDLL {
	public static void main(String[] args) {

		DLL list = new DLL();

		list.insertFirst(5);
		list.insertFirst(6);
		list.insertFirst(8);
		list.insertFirst(9);
		list.insertFirst(7);
		list.display();
		list.revDisplay();
		list.removeLast();
		list.display();
		list.addLast(76);
		list.display();
	}
}
