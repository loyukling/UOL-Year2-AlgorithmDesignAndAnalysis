
public class Node {

	private Object item;
	private Node next;
	
	public Node(Object newItem) {
		
		item = newItem;
		next= null;
		
	}
	
	public Node(Object newItem, Node nextNode) {
		
		item = newItem;
		next = nextNode;
	}
	
	public void setIten(Object newItem) {
		item = newItem;
		
	}
	public Object getItem() {
		return item;
		
	}
	
	public Node getNext() {
		return next;
		
	}
	
	public void setNext(Node nextNode) {
		next = nextNode;
		
	}
}
