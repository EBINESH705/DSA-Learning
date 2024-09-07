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
	    
		Node first = new Node(10);
		Node second =new Node(22);
		Node third=new Node(30);
		Node fourth =new Node(5);
		
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
		int minval=first.data;
		Node currnode=first;
		System.out.println("The Lowest Value in a Linked List");
		while(currnode!=null){
		   if(currnode.data<minval){
		       minval=currnode.data;
		   }
		    currnode= currnode.next;
		}
		System.out.println(minval);
		
	}
}
