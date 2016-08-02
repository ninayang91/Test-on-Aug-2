import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Queue;

public abstract class AbstractQueue extends AbstractCollection implements Queue {

	protected AbstractQueue() {
		// TODO Auto-generated constructor stub
	}
	
	public abstract Object dequeue();
	public abstract Object enqueue(Object object);
	public abstract Object getBack();
	public abstract Object getFront();
	public abstract Iterator iterator();
    public abstract int size();
    
    public boolean equals(Object object){
    	//overrides the equals() method from the Object class
    	if(object == this) return true;
    	if(!(object instanceof AbstractQueue)) return false;
    	AbstractQueue abstractQueue = (AbstractQueue) object;
    	if(abstractQueue.size() != size()) return false;
    	return containsAll(abstractQueue);
    }
    
    public int hashCode(){
    	//overrides the hashCode() method from the Object class
    	int n = 0;
    	for(Iterator it = iterator(); it.hasNext();){
    		Object object  = it.next();
    		if(object != null){
    			n += object.hashCode();
    		}
    	}
    	return n;
    }
}
