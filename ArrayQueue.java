import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayQueue extends AbstractQueue{
	int back = 0;
	int front = 0;
	Object[] objects;
	int capacity = 16;
	
	public ArrayQueue() {
		// TODO Auto-generated constructor stub
		objects = new Object[capacity];
	}
	public ArrayQueue(int capacity) {
		// TODO Auto-generated constructor stub
		this.capacity = capacity;
		objects = new Object[capacity];
	}
	
	@Override
	public Object dequeue() {
		// TODO Auto-generated method stub
		if(isEmpty()) throw new NoSuchElementException("Queue is empty");
		Object object = objects[front];
		front ++;
		if(front*2>=capacity){
			for(int i=0; i<back-front; i++){
				objects[i] = objects[i+front];
			}
			back = back-front;
			front = 0;
		}
		return object;
	}

	@Override
	public Object enqueue(Object object) {
		// TODO Auto-generated method stub
		if(back>=capacity){
			Object[] temp = objects;
			capacity *= 2;
			objects = new Object[capacity];
			for(int i=0; i<back-front; i++){
				objects[i] = temp[i+front];
			}
			back = back-front;
			front = 0;
			
		}
		objects[back]=object;
		back++;
		return object;
	}

	@Override
	public Object getBack() {
		// TODO Auto-generated method stub
		if(isEmpty()) throw new NoSuchElementException("Queue is empty");
		return objects[back-1];
	}

	@Override
	public Object getFront() {
		// TODO Auto-generated method stub
		if(isEmpty()) throw new NoSuchElementException("Queue is empty");
		return objects[front];
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return back - front;
	}


	@Override
	public boolean offer(Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object remove() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object poll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object element() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object peek() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
/*	
	protected Object[] objects;//ArrayQueue s objects[]的子集
	protected int front =0;
	protected int back = 0;
	protected int capacity = 16;
	
	public ArrayQueue() {
		// TODO Auto-generated constructor stub
		objects = new Object[capacity];
	}
	
	public ArrayQueue(int capacity) {
		// TODO Auto-generated constructor stub
		this.capacity = capacity;
		objects = new Object[capacity];
	}
	
	@Override
	public Object dequeue() {
		// TODO Auto-generated method stub
		if(isEmpty()) throw new NoSuchElementException("Queue is empty");
		Object object = objects[front++];
		if(2*front >= capacity){
			for(int i=0; i<size(); i++){
				objects[i] = objects[i+front];
			}
			back = back - front;
			front =0;
		}
		return object;
	}

	public Object enqueue(Object object) {
		// TODO Auto-generated method stub
		if(back >= capacity){
			Object[] temp = objects;
			capacity *= 2;
			objects = new Object[capacity];
			for(int i=0; i<back-front; i++){
				objects[i] = temp[i+front];
			}
			back = back - front;
			front =0;
		}
		objects[back] = object;
		back++; // same as objects[back++] = object;
		return object;
	}

	

	@Override
	public Object getBack() {
		// TODO Auto-generated method stub
		if(isEmpty()) throw new NoSuchElementException("Queue is empty");
		return objects[back-1];
	}

	@Override
	public Object getFront() {
		// TODO Auto-generated method stub
		if(isEmpty()) throw new NoSuchElementException("Queue is empty");
		return objects[front];
	}
	
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new Iterator();
		int cursor = front;
		public boolean hasNext(){
			return cursor < back;
		}
		public Object next(){
			if(cursor >= back) throw new NoSuchElementException();
			return objects[cursor++];
		}
		public void remove() {
			// TODO Auto-generated method stub
			throw new UnsupportedOperationException();
		}
	};

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return back-front;
	}

	@Override
	public boolean offer(Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	public Object poll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object element() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object remove() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}*/
