package cracking.linkedlist;

public class LinkedList {
	private Node head;
	private Node tail;
	
	LinkedList() {
		head = null;
		tail = null;
	}
	
	void AddNode(Node node) {
		if (null == head) {
			head = node;
			tail = node;
		}
		else {
			tail.next = node;
			tail = node;			
		}
	}
	public void Add(String string) {
		Node node = new Node(string);
		
		if (null == head) {
			head = node;
			tail = node;
		}
		else {
			tail.next = node;
			tail = node;			
		}
	}
	
	Node FindBeginning() {
		Node slow = head;
		Node fast = head;
		
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				break;
			}
		}
		
		if (fast == null || fast.next == null) {
			return fast;
		}
		
		slow = head;
		while (slow != fast) {
			slow = slow.next;
			fast = fast.next;
		}
		return fast;
	}
}
