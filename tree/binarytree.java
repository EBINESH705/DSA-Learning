public class binarytree
{
	public static  class tree {
		char data;
		tree right;
		tree left;
		public tree( char data) {
			this.data=data;
			this.right=right;
			this.left=left;
		}
	}
	public static void main(String[] args) {
		tree root=new tree('R');
		tree nodeA= new tree('A');
		tree nodeB= new tree('b');
		tree nodeC= new tree('c');
		tree nodeD= new tree('D');
		tree nodeF=new tree('F');
		tree nodeG=new tree('G');

		root.left=nodeA;
		root.right=nodeB;

		nodeA.left=nodeC;
		nodeA.right=nodeD;

		nodeB.left=nodeF;
		nodeB.right=nodeG;
        
        System.out.println("Binary Tree Implementation");
		System.out.println("root.left.left.data"+":"+root.left.left.data);
	}
}
