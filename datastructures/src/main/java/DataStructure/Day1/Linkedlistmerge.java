package DataStructure.Day1;

import org.junit.Test;

public class Linkedlistmerge {
	
	


	        @Test
	        public void printMergeLinkedList() {
	                Node head1=addNode(1);
	                head1.next=addNode(3);
	                head1.next.next=addNode(5);
	        //        head1.next.next.next=addNode(7);
	          //      head1.next.next.next.next=addNode(9);

	                Node head2=addNode(2);
	                head2.next=addNode(4);
	                head2.next.next=addNode(6);
	                head2.next.next.next=addNode(8);
	                head2.next.next.next.next=addNode(10);
	                head2.next.next.next.next.next=addNode(12);


	         Node Merged = printMergeNodes(head1,head2);
	        // printAllNodes(Merged);
	        }
	        
	        private void printAllNodes(Node node)
			{
			while(node != null)
			{
			System.out.println(node.data);
			node=node.next;
			}
			}


	        public class Node{

	                int data;
	                Node next;

	                Node(int key){
	                        this.data=key;
	                        next=null;
	                }

					public Node() {
						// TODO Auto-generated constructor stub
					}
					
					

					
	        }

	 public Node addNode(int data) { return new Node(data); }
	 

	        public Node printMergeNodes(Node node1,Node node2) {
	        	Node merged = new Node();
	        	Node curr = merged;
	        	while(node1 !=null && node2 != null)
	        	{
	        	if(node1.data < node2.data){
	        	curr.next = node1;
	        	//System.out.println(curr.next.data);
	        	node1 = node1.next;
	        	}else{
	        	 
	        	//System.out.println(curr.next.data);
	        	node2 = node2.next;
	        	}
	        	curr = curr.next;
	        	}
	        	if(node1!=null)
	        	{
	        	curr.next = node1;
	        	}
	        	else{
	        	curr.next = node2;
	        	System.out.println(curr.next.data);
	        	}
	        	System.out.println(curr.next.next.data);
	        	return merged.next;
	        }

}
