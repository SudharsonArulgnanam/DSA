package Practice;

import org.junit.Test;

import DataStructure.Day1.PracticeProblem.Node;

public class reverseSingleLinkedList {
	
	@Test
	public void reverseLinkedlist() {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next= new Node(40);
		printLinkedList(head);
		printLinkedList(reverseLinkedList(head));
	}
	
	private Node reverseLinkedList(Node head) {
		// TODO Auto-generated method stub
		Node curr=head, prev=null,next=null;
		
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		
		return prev;
	}

	public Node printLinkedList(Node head) {
		
		while(head!=null) {
			System.out.print(head.data+"-->");
			head=head.next;
		}
		System.out.println("null");
		return head;
		
	}
	
	public class Node{
		int data;
		Node next;
		
		Node(int key){
			this.data = key;
			next=null;
		}
	}


}
