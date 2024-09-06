public class Main
{   
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
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
		second.next=third;
		third.next=fourth;
		fourth.next=null;
		
		//printing the nodes
		
		Node currnode=first;
		System.out.println(" The Nodes Are ");
		while(currnode!=null){
		    System.out.print(currnode.data+"-->");
		    currnode= currnode.next;
		}
		System.out.print("null");
	}
}
