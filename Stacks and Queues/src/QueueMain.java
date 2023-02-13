public class QueueMain {

	public static void main(String[] args) throws QueueException {

		CustomQueue line = new CustomQueue(5);
		line.push(5);
		line.push(7);
		line.push(9);
		line.push(51);
		line.push(55);

		line.display();

		System.out.println(line.pop());

		line.display();

		System.out.println(line.pop());

		line.display();

		System.out.println(line.pop());

		line.display();


	}
}
