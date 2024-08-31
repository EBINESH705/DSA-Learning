import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Bubble Sort in Accending Order");
		System.out.println("Enter the size of array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter The Values Line By Line");
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
	    for(int i=0;i<n;i++){
		    boolean swapped=false;
		    for(int j=0;j<n-i-1;j++){
		        if(arr[j]>arr[j+1]){
		            int temp=arr[j];
		             arr[j]=arr[j+1];
		             arr[j+1]=temp;
		             swapped=true;
		        }
		    }
        //This Is Used To Check Is Array Is Sorted 
		    if(!swapped){
		        break;
		    }
		}
		System.out.println("Sorted Array:");
		for(int i:arr){
		    System.out.print(i+" ");
		}
	}
}
//Time  Complexity is O(n*2)
// One "n" Inner For Loop And Another For Outer For Loop so N*N=n*2
