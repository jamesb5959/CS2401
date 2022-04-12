
public class PlayWithStacksAndQueues {

	/** 
	 * TODO 1.5
	 * Complete this method that checks if a given string is well parenthesed
	 * using a StackL
	 */
	public static boolean WellParenthesed(String str) {
		StackL<String> S = new StackL<String>();
		// YOUR CODE GOES HERE
		for(int i=1; i<=str.length(); i++){
			char charTemp = str.charAt(str.length()-i);
			String temp = charTemp+"";
			S.push(temp);
		}
		int openCount = 0;
		int closeCount = 0;
		while(!S.isEmpty()){
			String pop = S.pop().getData();
			if(!pop.equals("(") || !pop.equals(")")){
				return false;
			}
			else if(pop.equals("(")){
				openCount++;
			}
			else if(pop.equals(")")){
				closeCount++;
			}
		}
		if (openCount!=0 && closeCount !=0 && openCount == closeCount){
			return true;
		}
		if(openCount==0 && closeCount ==0 || openCount != closeCount){
			return false;
		}
		return S.isEmpty();
	}
	
	/** TODO 2.3
	 * This is the method that is given to you, about which you need to answer the following question:
	 * How large should the queue be for this method to work properly without wasting too much space? 
	 * Please justify your answer.
	 */
	
	/* I have not be able to get this method working consitanly because I've been have problems with
	*  dequeue() method. Since the maze represented in the labs instructions the row is 6 and the
	*  column is 5 so we would need a queue of 29.
	*/
	public static void propagateMaze(int[][] maze, int row, int col) {
		int size = 29; // this line of code relates to the question asked. Play with it to see the effect.
		// Here we declare a queue of 1D arrays. In fact, it will be a queue of coordinates.
		QueueA<int[]> Q = new QueueA<int[]>(size);
		int[] coord = {row, col};
		Q.enqueue(coord);
		
		while (!Q.isEmpty()) {
			coord = Q.dequeue();
			if (coord[0]-1 >= 0) {
				if (maze[coord[0]-1][coord[1]] == 0) {
					maze[coord[0]-1][coord[1]]  = maze[coord[0]][coord[1]] + 1;
					int[] coord1 = {coord[0]-1,coord[1]};
					Q.enqueue(coord1);
				}
				if (coord[1]-1 >= 0 && maze[coord[0]-1][coord[1]-1] == 0) {
					maze[coord[0]-1][coord[1]-1]  = maze[coord[0]][coord[1]] + 1;
					int[] coord2 = {coord[0]-1,coord[1]-1};
					Q.enqueue(coord2);
				}
				if (coord[1]+1 < maze[0].length && maze[coord[0]-1][coord[1]+1] == 0) {
					maze[coord[0]-1][coord[1]+1]  = maze[coord[0]][coord[1]] + 1; 
					int[] coord3 = {coord[0]-1,coord[1]+1};
					Q.enqueue(coord3);
				}
			}
			if (coord[0]+1 < maze.length) {
				if (maze[coord[0]+1][coord[1]] == 0) { 
					maze[coord[0]+1][coord[1]]  = maze[coord[0]][coord[1]] + 1;
					int[] coord4 = {coord[0]+1,coord[1]};
					Q.enqueue(coord4);
				}
				if (coord[1]-1 >= 0 && maze[coord[0]+1][coord[1]-1] == 0) {
					maze[coord[0]+1][coord[1]-1]  = maze[coord[0]][coord[1]] + 1;
					int[] coord5 = {coord[0]+1,coord[1]-1};
					Q.enqueue(coord5);
				}
				if (coord[1]+1 < maze[0].length && maze[coord[0]+1][coord[1]+1] == 0) {
					maze[coord[0]+1][coord[1]+1]  = maze[coord[0]][coord[1]] + 1; 
					int[] coord6 = {coord[0]+1,coord[1]+1};
					Q.enqueue(coord6);
				}
			}
			if (coord[1]-1 >= 0 && maze[coord[0]][coord[1]-1] == 0) {
				maze[coord[0]][coord[1]-1]  = maze[coord[0]][coord[1]] + 1;
				int[] coord7 = {coord[0],coord[1]-1};
				Q.enqueue(coord7);
			}
			if (coord[1]+1 < maze[0].length && maze[coord[0]][coord[1]+1] == 0) {
				maze[coord[0]][coord[1]+1]  = maze[coord[0]][coord[1]] + 1;
				int[] coord8 = {coord[0],coord[1]+1};
				Q.enqueue(coord8);
			}
			if (maze[coord[0]][coord[1]] == 0)
				maze[coord[0]][coord[1]] = -1;
		}
	}
	
	
	public static void print(int[][] A) {
		for (int i=0; i<A.length; i++) {
			for (int j=0; j<A[i].length; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		String str = "()(";
		System.out.println(WellParenthesed(str));
		
		int[][] maze = new int[5][6];
		propagateMaze(maze,1,1);
		print(maze);
	}
	
}
