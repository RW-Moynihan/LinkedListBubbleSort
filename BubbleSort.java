//Will Moynihan
//S02331452
public class BubbleSort 
{ // Start class BubbleSort

	public static void main(String[] args) 
	{// Start main method
		
		    String[] test = {"Hawaii","Colorado","Alabama",
		                     "Montana","New York","Florida",
		                     "South Dakota"};
		    
		    print(test);
		    sort(test);
		    print(test);
	}// End main method
	
		public static void print(String[] tmp) 
		{ // Start helper method print 
			for (String item: tmp) 
			{
				System.out.println(item);
			}
			System.out.println();
		}// End helper method print
		
		public static void sort(String[] tmp) 
		{// Start sort method
			int swapCount = 0;
			// stores number of swaps per pass in bubblesort
			int alphaCompare = 0; 
			// Holds the alphabetical position of tmp[i] compared to tmp[i+1]
			String tempStorage = "";
			// Temporarily stores data during swap 
		do {// Start do-while loop	
			swapCount = 0; 
		       for (int i = 0; i < tmp.length -1; i++) 
			   {// Start for loop
				   alphaCompare = tmp[i].compareTo(tmp[i+1]);
				  if (alphaCompare > 0) 
				  {
					tempStorage = tmp[i]; 
					tmp[i] = tmp[i+1];
					tmp[i+1] = tempStorage;
					swapCount++;
				  }// End if statement
			   } // End for loop
		   } while (swapCount > 0); // end do-while loop
			
		}// End sort method 
		

} // End class BubbleSort


