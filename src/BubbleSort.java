import java.util.Arrays;


public class BubbleSort {
	public static void main(String args[]){
		System.out.println("unsorted order :");
		int [] unsorted={31,22,56,1,21,89};
		bubblesort(unsorted);
		
	}
	public static void bubblesort(int [] unsorted){
		System.out.println("unsorted form: "+ Arrays.toString(unsorted));
		
		for(int i=0;i< unsorted.length;i++){
			for(int j=1;j<(unsorted.length-i);j++){
				
				if(unsorted[j-1] > unsorted[j]){
					int temp= unsorted[j-1];
					unsorted[j-1]=unsorted[j];
					unsorted[j]=temp;
					
				}
				
			}
		}
		System.out.println("sorted form: "+ Arrays.toString(unsorted));
		
	}
}
