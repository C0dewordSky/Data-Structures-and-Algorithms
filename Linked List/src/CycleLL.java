
public class CycleLL {

	//Happy Number
	public boolean isHappy(int n) {

		int slow = n;
		int fast = n;

		do{
			slow = square(slow);
			fast = square(square(fast));
		}while(slow!=fast);

		if(slow == 1){
			return true;
		}

		return false;

	}

	private int square(int num){
		int ans = 0;

		while(num>0){
			int rem = num%10;
			ans += Math.sqrt(rem);
			num = num/10;
		}

		return ans;
	}

	// Middle of Linked List : Leetcode 876

	public ListNode middleNode(ListNode head) {
		ListNode temp = head;
      int count = 0;
		ListNode mid = head;

      while(temp!=null){
      	temp = temp.next;
      	count++;
      }
      for(int i=0;i<middle(count);i++){
      	mid = mid.next;
      }
      return mid.val;

	}

	private int middle(int count){
		int mid = count/2;
		return mid;
	}

	//Sort List : Leetcode 148

	public ListNode sortList(ListNode head) {

		ListNode sorted = new ListNode();

		ListNode f = head;
		ListNode s = head;

		while(s!=null){
			if(f.val < s.next.val){
				sorted.val = f.val;
			}
		}
	}
}
