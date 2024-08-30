// Based on the mathematic formula for Fibonacci number n is F(n)=F(n-1)+F(n-2).
import java.util.Scanner;
public class Main
{   
    public static int fibonacci(int n){
        if(n<=1){
            return n;
        }else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
	public static void main(String[] args) {
	 System.out.println("Enter The Numbers To Print Fibonacci Number");
	    Scanner l=new Scanner(System.in);
	    int n=l.nextInt();
	    System.out.println("The Fibonacci Number Is:");
	    System.out.println(fibonacci(n));
	}
}
