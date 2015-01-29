import java.util.*;
public class fibonacci{
	public static void main(String args[]){
		System.out.println("Enter the number upto which to find fibonacci series: ");
		Scanner s= new Scanner(System.in);
		int number= s.nextInt();
		for(int i=1;i<=number;i++){
			System.out.println(fibonacciLoop(i)+" ");
		}
	}
	public static int fibonacciRecursion(int n){
		if(n==1 || n==2){
			return 1;
		}
	return fibonacciRecursion(n-1)+fibonacciRecursion(n-2);	
	}
	
	public static int fibonacciLoop(int n){
		if(n==1 || n==2){
			return 1;
		}
		int fib1=1, fib2=1, fibonacci=1;
		for(int i=3;i<=n;i++){
			fibonacci= fib1+fib2;
			fib1=fib2;
			fib2= fibonacci;
			
			
		}
		return fibonacci;
	}
}