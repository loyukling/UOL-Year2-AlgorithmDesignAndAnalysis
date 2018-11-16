
public class queues {
	 Node front = null;
	 Node  rear = null;
	 
	 //input : 1 2 3 4 5
	 //output: 1 2 3 4 5 
	 /*working :
	  * enqueue : 1 2 3 4 5 
	  * dequeue:
	  * 
	 */
	 
	
	//Q2 initialise : set front & rear  = null
		public void initialise() {
			front = null;
			rear = null;
		}
		
		public void enqueue(Node p) {
		 if (!(p==null)) {
			 if(front== null) {
				 front = p;
				 rear = p;
				 
			 }else {
			rear.setNext(p);
				rear = p; 
			 }
			 p.setNext(null);
			 }
		 System.out.print(rear.getItem());
		 
		}
		 
		public  Node dequeue() {
		Node x = null;
			if (!(front==null)) {
				System.out.print(front.getItem());
				 x = front;
				 front = front.getNext();
				  if(front == null) {
				rear = null;	 
				 }
			}	 return x;
			
		} 
			
}
