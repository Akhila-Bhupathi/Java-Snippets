class LinkedList{
	Node head;
	static class Node {
		int data;
		Node next;
		Node(int d) {
			this.data=d;
		}
	}
	
	public void insert(LinkedList l,int data) {
		Node new_node = new Node(data);
		if(l.head == null) {
			l.head = new_node;
		} else {
			Node node = l.head;
			while(node.next != null) {
				node=node.next;
			}
			node.next = new_node;
		}
	}
	
	public void print(LinkedList l) {
		Node node = l.head;
		while(true) {
			System.out.println(node.data);
			if(node.next == null)
				break;
			node = node.next;
		}
	}
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.insert(l,1);
		l.insert(l,10);
		l.insert(l,19);
		l.print(l);
	}
}
