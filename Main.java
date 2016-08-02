import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {
	private static final int NUMBER_OF_SERVERS = 4;
	private static final double MEAN_INTERARRIVAL_TIME = 20.0;
	private static final int DURATION = 100;
	private static Server[] servers = new Server[NUMBER_OF_SERVERS];
	private static LinkedQueue clients = new LinkedQueue();
	private static Random1 random = new Random1(MEAN_INTERARRIVAL_TIME);

	public static void main(String[] args) {
/*
		for (int i = 0; i < NUMBER_OF_SERVERS; i++) {
			servers[i] = new Server();
		}
		int timeOfNextArrival = random.intNextExponential();
		for (int t = 0; t < DURATION; t++) {
			if (t == timeOfNextArrival) {
				clients.enqueue(new Client(t));
				print(clients);
				timeOfNextArrival += random.intNextExponential();
			}

			for (int i = 0; i < NUMBER_OF_SERVERS; i++) {
				if (servers[i].isFree()) {
					if (!clients.isEmpty()) {
						servers[i].beginServing((Client) clients.dequeue(), t);
						print(clients);
					}
				} else if (t == servers[i].getTimeServiceEnds()) {
					servers[i].endServing(t);
				}
			}
		}*/
		// TODO Auto-generated method stub
		ArrayQueue q1 = new ArrayQueue();
		ArrayQueue q2 = new ArrayQueue();
		q1.enqueue("Amin");
		q1.enqueue("Bmin"); 
		q1.enqueue("Cmin");
		q2.enqueue("Dmin");
		q2.enqueue("Emin");
		ArrayQueue q = merge(q1,q2);
		System.out.println(q.getFront());
		System.out.println(second(q));
		System.out.println(q.getBack());
		//System.out.println(q.size());
		//ArrayQueue qRev = reversed(q);
		//System.out.println(qRev.getFront());
		//System.out.println(removeLast(q));
		//System.out.println(q.getFront());
		//System.out.println(q.getBack());

		//q.dequeue();

		// System.out.println(q.getFront());
		// int i = 0;
		// System.out.println(i++);
		/*
		 * LinkedQueue q1 = new LinkedQueue(); q1.enqueue("Amin");
		 q1.enqueue("Bmin"); q1.enqueue("Cmin"); q1.dequeue(); q1.dequeue();
		 * //q.enqueue("haha");
		 * 
		 * System.out.println(q1.getFront()); System.out.println(q1.getBack());
		 */

	}
	
	public static ArrayQueue merge(ArrayQueue q1, ArrayQueue q2){
		ArrayQueue q = new ArrayQueue();
		while(!q1.isEmpty() && !q2.isEmpty()){
			q.enqueue(q1.dequeue());
			q.enqueue(q2.dequeue());
		}
		
			while(!q1.isEmpty()){
				q.enqueue(q1.dequeue());
			}
	
			while(!q2.isEmpty()){
				q.enqueue(q2.dequeue());
			}
		
		return q;
	}
	
	public static Object removeLast(ArrayQueue queue){
		Object object = null;
		int counter =0;
		ArrayQueue tempQ = new ArrayQueue();
		while(!queue.isEmpty()){
			tempQ.enqueue(queue.dequeue());
			counter++;
		}
		for(int i=0; i<counter-1; i++){
			queue.enqueue(tempQ.dequeue());
		}
		object = tempQ.dequeue();
		return object;
	
	}
	
	public static Object last(ArrayQueue queue){
		Object object = null;
		ArrayQueue tempQ = new ArrayQueue();
		while(!queue.isEmpty()){
			object = queue.dequeue();
			tempQ.enqueue(object);
		}
		while(!tempQ.isEmpty()){
			queue.enqueue(tempQ.dequeue());
		}
		return object;
	}
	
	public static Object second(ArrayQueue queue){
		Object object;
		ArrayQueue tempQ = new ArrayQueue();
		tempQ.enqueue(queue.dequeue());
		object = queue.dequeue();
		tempQ.enqueue(object);
		while(!queue.isEmpty()){
			tempQ.enqueue(queue.dequeue());
		}
		while(!tempQ.isEmpty()){
			queue.enqueue(tempQ.dequeue());
		}
		return object;
	}
	
	private static ArrayQueue reversed(ArrayQueue queue){
		ArrayQueue newQueue = new ArrayQueue();
		Stack stack = new Stack();
		Object object;
		while(!queue.isEmpty()){
			object = queue.dequeue();
			stack.push(object);
			newQueue.enqueue(object);
		}
		while(!newQueue.isEmpty()){
			object = newQueue.dequeue();
			queue.enqueue(object);
		}
		while(!stack.isEmpty()){
			object = stack.pop();
			newQueue.enqueue(object);
		}
		
		return newQueue;
	}
		
	
	private static void reverse(ArrayQueue queue){
		//ArrayQueue tempQ= new ArrayQueue();
		Stack stack = new Stack();
		Object object;
		while(!queue.isEmpty()){
			object = queue.dequeue();
		//	tempQ.enqueue(object);
			stack.push(object);
		}
		while(!stack.isEmpty()){
			queue.enqueue(stack.pop());
		}
		
	}
/*		//Stack s = new Stack();
		if(queue.isEmpty()) {
			return;
		}
		int size = queue.size();
		Object[] temp = new Object[size];
		for(int i = 0;i<size;i++){
			
			temp[i] = queue.dequeue();
			//System.out.println(temp[i]);
		}
		for(int i = size-1;i>=0;i--){
			//System.out.println(temp[i]);
			queue.enqueue(temp[i]);
		}
		
	}*/


	private static void print(LinkedQueue LQueue) {
		int size = LQueue.size();
		if (size == 0) {
			System.out.println("The Queue is now empty.");
		} else {
			System.out.println("The queue now contains " + size + " job" + (size > 1 ? "s: " : ": ") + LQueue);
		}
	}

}
