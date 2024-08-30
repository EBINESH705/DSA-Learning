import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    System.out.println("Enter The N Numbers To Print Fibonacci");
	    Scanner l=new Scanner(System.in);
	    int n=l.nextInt();
		int a=0;
		int b=1;
		System.out.println("The Fibonacci series are:");
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<n;i++){
		    int temp=a+b;
		    a=b;
		    b=temp;
		    System.out.println(temp);
		}
	}
}
