import java.util.Queue;

public class stackTest {
 
	//Q1 : Stack
	//input : 1,2,3,4,5
	//output:5,4,3,2,1
	
	//Q2: Queue
	//input: 1 2 3 4 5
	//output: 1 2 3 4 5
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node x1 = new Node(1);
		Node x2 = new Node(2);
		Node x3 = new Node(3);
		Node x4 = new Node(4);
		Node x5 = new Node(5);
		
		Stack a = new Stack();
	/*	//insert input
		a.push(x1);
		a.push(x2);
		a.push(x3);
		a.push(x4);
		a.push(x5);
		
		
		//show output
	   a.pop();
	   a.pop();
	   a.pop();
	   a.pop();
	   a.pop();
	*/
		
	//Q2
		/*queues q = new queues();
		
		q.enqueue(x1);
		q.enqueue(x2);
		q.enqueue(x3);
		q.enqueue(x4);
		q.enqueue(x5);
		

		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		
		*/
		//Q3 
		
		queues q = new queues();
		
		q.enqueue(x1);
		q.enqueue(x2);
		q.enqueue(x3);
		q.enqueue(x4);
		q.enqueue(x5);

		Stack s = new Stack();
		s.push(q.dequeue());
		s.push(q.dequeue());
		s.push(q.dequeue());
		s.push(q.dequeue());
		s.push(q.dequeue());
		
		
		
		
		
		
		
		
		
		
	}

}
