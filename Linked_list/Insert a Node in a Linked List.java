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
	    public static Node insert(Node head,Node nodeinsert,int position){
	        if(position==1){
	            nodeinsert.next=head;
	            return nodeinsert;
	        }
	        Node currentnode=head;
	        for(int i=1;i<position-1&currentnode!=null;i++){
	            currentnode=currentnode.next;
	        }
	        if(currentnode!=null){
	            
	            nodeinsert.next=currentnode.next;
	            currentnode.next=nodeinsert;
	        }
	        return head;
	    } 
	    
	public static void main(String[] args) {
	    Node one =new Node(10);
	    Node two =new Node(20);
	    Node three =new Node(30);
	    Node four =new Node(40);
	    Node five =new Node(50);
	    Node ins=new Node (22);
	    one.next=two;
	    two.next=three;
	    three.next=four;
	    four.next=five;
	    five.next=null;
	    
	    System.out.println("Nodes Before insertion");
	    traverse(one);
	    insert(one,ins,3);
	    System.out.println("Nodes After insertion");
	    traverse(one);
	}
}
