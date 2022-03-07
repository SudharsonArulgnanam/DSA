package Practice;

import org.junit.Test;


public class createdoublyLinkedList {
	
	@Test
	public void reverseLinkedlist() {
		Node head = new Node(10);
		head.insert(20, head);
		head.insert(30, head);
		head.insert(40, head);
		
		
		printLinkedList(head);
		printLinkedList(reverseLinkedList(head));
	}
	
	
	
	private Node reverseLinkedList(Node head) {
		// TODO Auto-generated method stub
		Node curr=head, temp=null;
		
		while(curr!=null) {
			temp=curr.prev;
			curr.prev=curr.next;
			curr.next=temp;
			curr=curr.prev;
			
		}
		
		if(temp!=null) {
			head=temp.prev;
		}
		
		return head;
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
		Node next,prev;
		
		Node(int key){
			this.data = key;
			next=null;
			prev=null;
		}
		
		public void insert(int data,Node node) {
		
			while(node.next!=null) {
				node=node.next;
			}
			
			Node a = new Node(data);
			a.prev=node; 
			node.next=a;
			
		}
	}


}
