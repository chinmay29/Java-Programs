import java.util.*;
public class anagrams {
	public static void main(String args[]){
	char[] word1;
	char[] word2;
	System.out.println("Enter the two words :");
	Scanner s= new Scanner(System.in);
	word1=s.nextLine().toUpperCase().toCharArray();
	word2=s.nextLine().toUpperCase().toCharArray();
	ifanagrams(word1,word2);
	}
	public static void ifanagrams(char [] word1, char [] word2){
		
	Map<Character, Integer> lettersInWord1 = new HashMap<Character, Integer>();
	for(int i=65;i<=90;i++){
		lettersInWord1.put((char)i, 0);
	}
	for(char c : word1){
		
	 lettersInWord1.put(c, lettersInWord1.get(c)+1);
	 
	}

	for(char c : word2) {
		 lettersInWord1.put(c, lettersInWord1.get(c)-1);
	}

	for(char c : lettersInWord1.keySet()){
	  if(lettersInWord1.get(c) != 0){
	    System.out.println("they are not anagrams of each other");
	    return;
	  }
	}

	System.out.println("they are anagrams of each other");
	return;
	}
}
