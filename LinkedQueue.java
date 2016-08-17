import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedQueue extends AbstractQueue{
	
	Node header = new Node();
	int size =0;
	
	@Override
	public Object dequeue() {
		// TODO Auto-generated method stub
		if(isEmpty()) throw new NoSuchElementException("Queue is empty");
		Object object = header.next.object;
		header.next = header.next.next;
		header.next.previous = header;
		size--;
		return object;
	}

	@Override
	public Object enqueue(Object object) {
		// TODO Auto-generated method stub
		Node p = new Node(object, header, header.previous);
		header.previous.next = p;
		header.previous = p;
		size++;
		return null;
	}

	@Override
	public Object getBack() {
		// TODO Auto-generated method stub
		if(isEmpty()) throw new NoSuchElementException("Queue is empty");
		return header.previous.object;
	}

	@Override
	public Object getFront() {
		// TODO Auto-generated method stub
		if(isEmpty()) throw new NoSuchElementException("Queue is empty");
		return header.next.object;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
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
	private Node header = new Node();
	private int size = 0;
	
	public LinkedQueue() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Object dequeue() {
		// TODO Auto-generated method stub
		if(isEmpty()) throw new NoSuchElementException("Queue is empty");
		Object object = header.next.object;
		header.next = header.next.next;
		header.next.previous = header;
		--size;
		return object;

	}

	@Override
	public Object enqueue(Object object) {
		// TODO Auto-generated method stub
		Node p = header.previous;
		header.previous = p.next = new Node(object, header,p);
		
		Node p = new Node(object, header, header.previous);
		header.previous.next = p;
		header.previous = p;
		++size;
		return object;
	}

	@Override
	public Object getBack() {
		// TODO Auto-generated method stub
		if(isEmpty()) throw new NoSuchElementException("Queue is empty");
		return header.previous.object;
	}

	@Override
	public Object getFront() {
		// TODO Auto-generated method stub
		if(isEmpty()) throw new NoSuchElementException("Queue is empty");
		return header.next.object;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
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
*/