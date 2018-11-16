
public class stackTest {
 
	
	//input : 1,2,3,4,5
	//output:5,4,3,2,1
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node x1 = new Node(1);
		Node x2 = new Node(2);
		Node x3 = new Node(3);
		Node x4 = new Node(4);
		Node x5 = new Node(5);
		
		Stack a = new Stack();
		
		a.push(x1);
		a.push(x2);
		a.push(x3);
		a.push(x4);
		a.push(x5);
		
	   a.pop();
	   a.pop();
	   a.pop();
	   a.pop();
	   a.pop();
		
	}

}
