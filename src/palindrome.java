import java.util.Scanner;


public class palindrome {
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number to check for palindrome");
		int number= sc.nextInt();
		palindrome(number);
	}
	public static void palindrome(int n){
		if (n== reverse(n)){
			System.out.println("Number is palindrome");
		}
		else{
			System.out.println("Number is not spalindrome");
		}
		
	}
	public static int reverse(int n){
		int reverse= 0;
		
		while(n!=0){
			reverse= reverse*10 + n%10;
			n=n/10;
			
		}
		return reverse;
	}
}
