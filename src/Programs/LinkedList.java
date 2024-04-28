package Programs;

public class LinkedList {

	Node head;

	// LL is default class in java
	// It can be used in List,stack, Queue
	// It allows null entry
	// dynamic collection

	class Node {

		int data;
		Node Next;

		Node(int data) {
			this.data = data;
			Next = null;
		}
	}

		public void printMyLinkedList() {
			Node n = head;
			while (n != null) {
				System.out.println(n.data);
				n = n.Next;
			}
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			LinkedList ll = new LinkedList();

			Node first = ll.new Node(10);
			ll.head = first;
			
			Node second = ll.new Node(20);
			first.Next=second;
			
			ll.printMyLinkedList();
		}
	}