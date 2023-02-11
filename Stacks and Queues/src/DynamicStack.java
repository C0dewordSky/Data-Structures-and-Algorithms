

public class DynamicStack extends CustomStack {

	public DynamicStack() {
		super(); //it will call CustomStack(); i.e. the DEFAULT_SIZE
	}

	public DynamicStack(int size) {
		super(size);
	}

	@Override
	public boolean push(int item) {

		if (this.isFull()) {
			int[] temp = new int[data.length * 2];


			//Copy all previous items in data

			for (int i = 0; i < data.length; i++) {
				temp[i] = data[i];
			}

			data = temp;
		}

		// at this point we know that arrray is not full
		//Insert item

		return super.push(item);
	}
}
