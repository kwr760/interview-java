package limelight;

public class Reverse {
	private class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
			this.next = null;
		}
		
		public void add(int data) {
			Node node = new Node(data);
			Node next = this;
			
			while (null != next.next)
				next = next.next;

			next.next = node;
		}
		
		public void display() {
			Node node = this;
			
			while (null != node) {
				System.out.println(node.data);
				node = node.next;
			}
		}
	}

	public Node reverse(Node head) {
		Node current = head;
		Node newHead = null;
		while (current != null) {
			Node tmp = current;
			current = current.next;
			tmp.next = newHead;
			newHead = tmp;
		}
		return newHead;
	}
	
	public static void main(String[] args) {
		Reverse r = new Reverse();
		r.test();
	}
	
	public void test() {
		Node linked = new Node(1);
		linked.add(2);
		linked.add(3);
		linked.add(4);
		linked.add(5);
		reverse(linked);
		linked.display();
	}
}
