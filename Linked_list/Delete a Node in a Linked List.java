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
	    public static void traverse(Node head){
	        Node currentnode=head;
	        while(currentnode!=null){
	            System.out.print(currentnode.data+"-->");
	            currentnode=currentnode.next;
	        }
	        System.out.println("null");
	    }
	    public static Node todelete(Node head,Node nodedelete){
	        Node currentnode=head;
	       while(currentnode!=null){
	           if(currentnode.next!=null&currentnode.next==nodedelete){
	        currentnode.next=currentnode.next.next;
	           }
	           currentnode=currentnode.next;
	       }
	        return head;
	    } 
	    
	public static void main(String[] args) {
	    Node one =new Node(1);
	    Node two =new Node(2);
	    Node three =new Node(3);
	    Node four =new Node(4);
	    Node five =new Node(5);
	    
	    one.next=two;
	    two.next=three;
	    three.next=four;
	    four.next=five;
	    five.next=null;
	    
	    System.out.println("Nodes Before Deletion");
	    traverse(one);
	    one =todelete(one,three);
	    System.out.println("Nodes After Deletion");
	    traverse(one);
	}
}
