
public class Stack {

	
	Node top = null; 
	//initialise : set top to null
	public void initialise() {
		top = null;
		
		
	}
	//empty() : return(top =0)
	public boolean empty() {
return top == null;
	}
	
	//push(Object newNode) : 1- newNode.next = top , 2 top = newnode
	public void push (Node newNode) { //sub Object class to Node (access)
		
		newNode.setNext(top); 
		top =newNode;
		System.out.println(top.getItem());
	}
	
	//Object pop() : 1- if !empty , 2- x = topdata , top = top.next & return x
	//3- end if
	public Node pop() {
		Node x = null ; //declare x since x isn't found

		if(!empty()) {
			System.out.println(top.getItem());
			x = top;
			top=top.getNext();
			
			
			
		} return x;
		
	}
	
	
}
