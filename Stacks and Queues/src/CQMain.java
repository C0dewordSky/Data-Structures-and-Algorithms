public class CQMain {
	public static void main(String[] args) {

		CircularQueue circ = new CircularQueue(6);

		circ.insert(5);
		circ.insert(9);
		circ.insert(8);
		circ.insert(22);
		circ.insert(62);
		circ.insert(12);

          circ.display();

	}
}
