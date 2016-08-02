
public class Node {
	Object object;
	Node next, previous;
	
	Node(){
		this.previous = this.next = this;
	}
	
	Node(Object object, Node next, Node previous){
		this.object = object;
		this.next = next;
		this.previous = previous;
		
	}


}
