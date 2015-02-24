import java.io.*;

public class RoundRotation{
	public static void main(String args[])throws Exception{
		BufferedReader is= new BufferedReader(new InputStreamReader(System.in));
		String word1, word2;
		System.out.println("Enter two words:");
		word1=is.readLine();
		word2=is.readLine();
		int result= CheckRoundRotation(word1,word2);
		if(result==1){
			System.out.println("They are round rotation of each other");
		}
		else{
			System.out.println("They are not round rotation of each other");
		}
	}
	public static int CheckRoundRotation(String word1,String word2){
		char a1[], a2[];
		a1=word1.toCharArray();
		a2=word2.toCharArray();
		if(word1.length()!=word2.length()){
			return -1;
		}
		//System.out.println(a1[0]);
		int flag=1;
			
		for(int i=0;i<word1.length()-1;i++){
			if(a1[i]!=a2[i+1]){
				flag=0;
			}
		}
		if(a1[word1.length()-1]!=a2[0]){
			flag=0;
		}
		if(flag==1){
			return 1;
		}
		else { return 0; }
	}
}
		