
public class Buffer {
	
	public static void main(String args[]){
		String s1="abc";
		String s2=s1;
		s1+="d";
		
		if(s1==s2){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
		StringBuffer s3= new StringBuffer("abc");
		
		StringBuffer s4=s3;
		s3.append("d");
		if(s3==s4){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
	}
}
