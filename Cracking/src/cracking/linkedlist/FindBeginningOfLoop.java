package cracking.linkedlist;

public class FindBeginningOfLoop {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		
		Node a = new Node("a");
		Node b = new Node("b");
		Node c = new Node("c");
		Node d = new Node("d");
		Node e = new Node("e");
		Node f = new Node("f");
		ll.AddNode(a);
		ll.AddNode(b);
		ll.AddNode(c);
		ll.AddNode(d);
		ll.AddNode(e);
		ll.AddNode(f);
		ll.AddNode(d);
		System.out.println("The beginning node is :  " + ll.FindBeginning());
	}
}
