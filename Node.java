
public class Node {
	private Node nextNode;
	private Student student;

	public Node(Student newStudent) {//Start Node Constructor
		nextNode = null;
		Student student = newStudent;
	}//End Node Constructor 
	
	public Student getStudent() {
		return student;
	}
	
	public Node getNext() {
		return nextNode;
	}
	
	public void setNext(Node newNext) {
		nextNode = newNext;
	}
}
