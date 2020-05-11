
public class LinkedList {/// start class linked list
	Node head;
	
	LinkedList(Node newHead){
		head = newHead;
	}
	
	public void addNode(Node newNode)
	{
	    Node curNode = head;
	    while(curNode.getNext()!=null)
	    {
	        curNode = curNode.getNext();
	    }
	    curNode.setNext(newNode);
	}
	
	public String toString()
	{// start tostring method 
	    Node curNode = head;
	    StringBuilder result = new StringBuilder();
	    while(curNode != null)
	    {
	        result.append(curNode.getStudent().getFullName()).append("\n");
	        curNode = curNode.getNext();
	    }
	    return result.toString();
	} // end tostring method 
	
	public void bubbleSort() { // Start bubblesort method 
		boolean isSorted = false;
		
		while(!isSorted) {//Start outer while
			Node leftNode = head;
			Node rightNode = leftNode.getNext();
			Node prevNode = null;
			
			   while(rightNode != null) { //Start inner while
				    leftNode = head;  
					rightNode = leftNode.getNext();
					boolean hasSwapped = false;
					int alphaValue = leftNode.toString().compareTo(rightNode.toString()); 
				   if (alphaValue > 0) {
					   hasSwapped = true;
					   leftNode.setNext(rightNode.getNext());
					   rightNode.setNext(leftNode);
					   
					   if(prevNode == null) {//head case Node swap
						   head = rightNode;
					   }
					   
					   else { // regular swap 
						   prevNode.setNext(rightNode);
					   }
					   prevNode = rightNode;
					   rightNode = leftNode.getNext();
				   }
					  
				   else { // Shift tracking variables 
					   rightNode = rightNode.getNext();
					   leftNode = leftNode.getNext();
					   prevNode = prevNode.getNext();
				   }
				   
				   
				   if(hasSwapped = false) {
					   isSorted = true; //outer while end condition
				   }
			}
			
			
		}// end outer while 
	}// end bubblesort method 
	

} // end class linkedlist
