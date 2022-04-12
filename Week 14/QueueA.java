
public class QueueA<T extends Object> {
	/*	ATTRIBUTES: *********************************************
	 *  o	Head (an integer index)
	 * 	o	Tail (an integer index)
	 * 	o	Size
	 * 	o	Array of integers
	 */
	private int head;
	private int tail;
	private int size;
	private T[] queue;

	/* CONSTRUCTOR: *********************************************/
	public QueueA() {}
	
	public QueueA(int num) {
		queue = (T[]) new Object[num]; //new T[num];
		size = 0;
		head = -1;
		tail = 0;
	}
	
	/* GETTERS: *************************************************/
	public int getSize() {
		return size;
	}
	
	/* OTHER METHODS: *******************************************
	 *	o	Enqueue: takes data and adds it to the queue if it is not full
	 * 	o	Dequeue: method that removes the head of the queue, if the queue is not empty, and returns this element
	 *	o	Peek: returns the head element of the queue (without removing it)
	 *	o	Clear: empties the queue
	 *	o	isEmpty: returns true if the queue is empty, false otherwise
	 * 	o	isFull: returns true if the queue is full, false otherwise
	 */
	public boolean isFull() {
		return (size == queue.length);
	}

	public boolean isEmpty() {
		return (size == 0);
	}
	
	public void clear() {
		size = 0;
		head = -1;
		tail = 0;
	}
	
	public T peek() {
		if (!isEmpty()) return queue[head];
		return null;
	}
	
	/**
	 * TODO 2.1
	 * Complete the implementation of the dequeue method
	 * @return
	 */
	public T dequeue() {
		// YOUR CODE GOES HERE
		if(!isEmpty()){
			size--;
			T temp = queue[head];
			head =(head+1)%queue.length;
			return temp;
		}
		if(size==1)
			head--;
			return queue[head-1];
	}

	/**
	 * TODO 2.2
	 * Complete the implementation of the enqueue method
	 * @param data
	 */
	public void enqueue(T data) {
		// YOUR CODE GOES HERE
		queue[tail+1]=data;
		tail++;
		size++;
	}

}
