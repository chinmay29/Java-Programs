import java.io.*;
public class GreyCode {
	public static void main(String args[])throws Exception{
		GreyCode GC= new GreyCode();
		BufferedReader is= new BufferedReader(new InputStreamReader(System.in));
		String s1,s2;
		String s3= new String(new byte[]{0x0a});
		
		System.out.println("Enter two strings");
		s1=is.readLine();
		s2=is.readLine();
		
		long g1,g2;
		g1=GC.s_to_g(s3);
		g2=GC.s_to_g(s2);
		System.out.println("Grey number 1: "+g1);
		System.out.println("Grey number 2: "+g2);
		
		if(g1+1==g2 | g2+1==g2){
			System.out.println("1");
		}
		else{
			System.out.println("-1");
		}
	}
	public long s_to_g(String a1){
		long grey=0;
		char s[];
		s=a1.toCharArray();
		for(int i = a1.length()-1; i > 0; i--) {
			grey += ( ( (s[i]-'0') ^ (s[i-1]-'0') ) * Math.pow(2,a1.length()-i-1) );
		}
		grey += ((s[0]-'0') * Math.pow(2,a1.length()-1));
		return grey;
	}
}
