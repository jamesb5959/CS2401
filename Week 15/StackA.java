
public class StackA<T> {
	/** Attributes ****************************************/
	private int top;
	private T[] stack;
	
	/** Constructors **************************************/
	public StackA() {
		stack = (T[]) new Object[10]; // new T[10]; // by default, the size of the array is 10
		top = -1;
	}
	
	public StackA(int size) {
		stack = (T[]) new Object[size]; 
		top = -1;		
	}

	/** Getters and Setters *********************************/
	/**
	 * @return the top
	 */
	public int getTop() {
		return top;
	}

	/**
	 * @param top the top to set
	 */
	public void setTop(int top) {
		this.top = top;
	}

	/**
	 * @return the stack
	 */
	public T[] getStack() {
		return stack;
	}

	/**
	 * @param stack the stack to set
	 */
	public void setStack(T[] stack) {
		this.stack = stack;
	}
	
	/** Other methods, specific to Stacks *********************/
	// peek, pop, push, isEmpty, isFull
	
	/**
	 * TODO 1.1.1: Complete the body of the method below
     * This method returns the top element of the stack, but leaves it on the stack
	 * @return
	 */
	public T peek() {
        // YOUR CODE GOES HERE 
		return stack[top];
    }
	
	/**
	 * TODO 1.1.2: Complete the body of the method below
     * This method returns the top element of the stack, and removes it from the stack
	 * @return
	 */
	public T pop() {
        // YOUR CODE GOES HERE 
		top--;
		return stack[top+1];
	}
	
	/** 
	 * TODO 1.1.3: Complete the body of the method below
	 * This method adds data onto the stack is the stack is not full
	 * @param data
	 */
	public void push(T data) {
        // YOUR CODE GOES HERE
		if(!isFull()){
		 	top++;
		 	stack[top]=data;
		}	
	}
	
	/** 
	 * TODO 1.1.4: Complete the body of the method below
	 * This method returns true is the stack is empty, false otherwise
	 * @param data
	 */
	public boolean isEmpty() {
        // YOUR CODE GOES HERE 
		return top == -1;
	}

	/** 
	 * TODO 1.1.5: Complete the body of the method below
	 * This method returns true is the stack is full, false otherwise
	 * @param data
	 */
	public boolean isFull() {
        // YOUR CODE GOES HERE 	
		return top == stack.length-1;
	}
}
