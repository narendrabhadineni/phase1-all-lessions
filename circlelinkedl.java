package circlelinkedl;

public class circlelinkedl {

	    	static class Node 
	    	{ 
	  		int data; 
	        		Node next; 
	                	Node(int d) 
	        		{ 
	            			data = d; 
	            			next = null; 
	        		} 
	}
	Node head; 
	circlelinkedl()   
	{ 
	head = null; 
	} 
	    	void sortedInsert(Node new_node) 
	    	{ 
	        		Node n = head; 
	if (n == null) 
	        		{ 
	            			new_node.next = new_node; 
	            			head = new_node; 
	  		} 
	else if (n.data >= new_node.data) 
	        		{ 
	while (n.next != head) 
	                			n = n.next; 
	  		 	n.next = new_node; 
	            			new_node.next = head; 
	            			head = new_node; 
	        		} 
	        		else
	        		{
	while (n.next != head && n.next.data < new_node.data) 
	                			n = n.next; 
	  			new_node.next = n.next; 
	            			n.next = new_node; 
	        		} 
		}
	void printList() 
	    	{ 
	        		if (head != null) 
	       		{ 
	            			Node temp = head; 
	            			do
	           			{ 
	                			System.out.print(temp.data + " "); 
	                			temp = temp.next; 
	            			}  while (temp != head); 
	        		} 
	    	}
	public static void main(String[] args) 
	    	{ 
		circlelinkedl l = new circlelinkedl(); 
	        		int arr[] = new int[] {10, 26, 5, 21, 3, 30}; 
	        		Node temp = null; 
	        		for (int i = 0; i < 6; i++) 
	        		{ 
	           			temp = new Node(arr[i]); 
	            			l.sortedInsert(temp); 
	        		} 
	l.printList(); 
	    	}		 

}
