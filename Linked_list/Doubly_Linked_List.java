public class Main
{   
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
	public static void main(String[] args) {
	    // creating Node
	    
		Node first = new Node(1);
		Node second =new Node(2);
		Node third=new Node(3);
		Node fourth =new Node(4);
		
		// Linking the Node
		first.next=second;
		first.prev=null;
		
		second.next=third;
		second.prev=first;
		
		third.next=fourth;
		third.prev=second;
		
		fourth.next=null;
		fourth.prev=third;
		//printing the nodes
		
		Node currnode=first;
		System.out.println("Doubly Linked List Implementation");
		System.out.println(" The Nodes forward ");
		while(currnode!=null){
		    System.out.print(currnode.data+"-->");
		    currnode= currnode.next;
		}
		System.out.println("null");
		
		// for backward printing
		
			
		currnode= fourth;
		System.out.println(" The Nodes backward ");
		while(currnode!=null){
		    System.out.print(currnode.data+"-->");
		    currnode= currnode.prev;
		}
		System.out.print("null");
	}
}
