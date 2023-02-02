
	public class Main {
		public static void main(String[] args) {
			LL list = new LL();
			list.insertFirst(6);
			list.insertFirst(7);
			list.insertFirst(8);
			list.insertFirst(9);

			list.display();

			list.insertLast(99);

			list.display();

			list.insertMid(55, 3);

			list.display();

			list.getSize();

			list.removeFirst();

			list.display();

			list.removeLast();

			list.display();

			list.getSize();

			list.searchVal(8);

			list.searchVal(55);

			list.searchVal(99);

		}
	}
