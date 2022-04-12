
public class Maze {

	// Attributes *****************************************************************
	private char[][] board;
	private char[][] playboard;

    // Constructors ****************************************************************
	public Maze() {}
	
	public Maze(char[][] maze) {
		board = maze;
		/*board = new char[maze.length][maze[0].length];
		for (int i=0; i<maze.length; i++) {
			for (int j=0; j<maze[0].length; j++)
				board[i][j] = maze[i][j];
		}*/
	}

    // Getters and Setters *********************************************************
	/**
	 * @return the board
	 */
	public char[][] getBoard() {
		return board;
	}

	/**
	 * @param board the board to set
	 */
	public void setBoard(char[][] board) {
		this.board = board;
	}
	
	// Other methods, specific to Mazes *******************************************
	// print board, inDepthFirst, byLevel, QSCompetition
	public void printBoard() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++)
				System.out.print(board[i][j] + ", ");
			System.out.println();
		}
	}
	
	/** 
     * TODO 2.1: Complete below the body of the method inDepthFirst
     * This method navigates through the maze in a depth-first manner.
     * As it goes, it collects rewards and keeps track of the number of visited cells.
     * It returns an 1D array of 2 int elements, representing: the number of visited cells 
     * and the total reward at the time when the exit is reached.
     */
	public int[] inDepthFirst() {
		int[] scores = new int[2]; // will hold the number of points and the number of steps
		char[][] currentboard;
		int[] currentlocation;
		int numSteps = 0; // keeps track of the number of visited cells
		int Spoints = 0; // keeps track of the number of points collected throughout the traversal
		
		StackA<MazeStatus> S = new StackA<MazeStatus>(this.board.length*this.board[0].length); 
		MazeStatus MS = new MazeStatus(this,0,0); // current status as you start the navigation in the top left corner
		S.push(MS); // you initialize the stack
		
		while (!S.isEmpty()) {
			// We access and remove the maze at the top of our stack
			// ADD CODE HERE
			MazeStatus data = S.pop();
			currentlocation = data.getLocation();
			currentboard = this.board;

            // We update our number of steps
			// ADD CODE HERE
            numSteps++;

			// We check if we are getting any rewards and update the Spoints
            // ADD CODE HERE
			int row = currentlocation[0];
			int columm = currentlocation[1];
			if(currentboard[row][columm]=='X'){
				Spoints += 0;
			}
			if(currentboard[row][columm]=='_'){
				Spoints += 0;
			}
			if(currentboard[row][columm]=='P'){
				Spoints += 15;
			}
			if(currentboard[row][columm]=='p'){
				Spoints += 10;
			}
			if(currentboard[row][columm]=='s'){
				Spoints += 5;
			}
			if(currentboard[row][columm]=='E'){
				Spoints += 50;
				break;
			}
			
            // We update the cell as visited
			// ADD CODE HERE
			if(currentboard[row][columm]=='X'){
				numSteps--;
			}
            
            // We identify the next immediate steps (up / left / down / right?)
            // and push the corresponding maze status in the stack
			// ADD CODE HERE
			if(row<currentboard.length && Spoints<50){
				row=currentlocation[0]+1;
				MS = new MazeStatus(this,row,columm);
				S.push(MS);
			}
			if(row==currentboard.length && Spoints<50){
				row=currentlocation[0];
				columm=currentlocation[1]+1;
				MS = new MazeStatus(this,row,columm);
				S.push(MS);
			}
			if(columm==currentboard[row].length && row==currentboard.length || Spoints>=50){
				currentlocation[0]=0;
				currentlocation[1]=0;
			}
		}	
		scores[0] = Spoints;
		scores[1] = numSteps;
		return scores;
	}

	/** 
     * TODO 2.2: Complete below the body of the method byLevel
     * This method navigates through the maze in a level-order manner.
     * As it goes, it collects rewards and keeps track of the number of visited cells.
     * It returns an 1D array of 2 int elements, representing: the number of visited cells 
     * and the total reward at the time when the exit is reached.
     */
	public int[] byLevel() {
		int[] scores = new int[2]; // will hold the number of points and the number of steps
		char[][] currentboard;
		int[] currentlocation;
		int numSteps = 0; // keeps track of the number of visited cells
		int Qpoints = 0; // keeps track of the number of points collected throughout the traversal
		
		QueueL<MazeStatus> Q = new QueueL<MazeStatus>();
		MazeStatus MS = new MazeStatus(this,0,0); // current status as you start the navigation in the top left corner
		Q.enqueue(MS);  // you initialize the queue
		
		while (!Q.isEmpty()) {
			// We access and remove the maze at the head of our queue
            // ADD CODE HERE
			Node<MazeStatus> data = Q.dequeue();
			MazeStatus temp = data.getData();
			currentlocation = temp.getLocation();
			currentboard = this.board;
            // We update our number of steps
			// ADD CODE HERE
            numSteps++;

			// We check if we are getting any rewards and update the Qpoints
            // ADD CODE HERE
			int row = currentlocation[0];
			int columm = currentlocation[1];
			if(currentboard[row][columm]=='X'){
				Qpoints += 0;
			}
			if(currentboard[row][columm]=='_'){
				Qpoints += 0;
			}
			if(currentboard[row][columm]=='P'){
				Qpoints += 15;
			}
			if(currentboard[row][columm]=='p'){
				Qpoints += 10;
			}
			if(currentboard[row][columm]=='s'){
				Qpoints += 5;
			}
			if(currentboard[row][columm]=='E'){
				Qpoints += 50;
				break;
			}
            
            // We update the cell as visited
			// ADD CODE HERE
			if(currentboard[row][columm]=='X'){
				numSteps--;
			}
            
            // We identify the next immediate steps (up / left / down / right?)
            // and enqueue the corresponding maze status in the queue
			// ADD CODE HERE
			//right
			if(columm<currentboard[row].length && Qpoints<50){
				columm=currentlocation[1]+1;
				MS = new MazeStatus(this,row,columm);
				Q.enqueue(MS);
			}
			//down
			if(columm==currentboard[row].length && Qpoints<50){
				row=currentlocation[0]+1;
				columm=currentlocation[1]=0;
				MS = new MazeStatus(this,row,columm);
				Q.enqueue(MS);
			}
			if(columm==currentboard[row].length && row==currentboard.length || Qpoints>=50){
				currentlocation[0]=0;
				currentlocation[1]=0;
			}
		}	
		scores[0] = Qpoints;
		scores[1] = numSteps;
		return scores;
	}
	
	/** 
     * BONUS TODO 3.1: Complete below the body of the method QScompetition
     * This method runs the previous two methods step by step (as if in parallel)
     * It stops whenever one of the two processes (stack-based or queue-based) reaches the exit.
     * At this point, the process that collected the most reward points wins.
     */
	public void QScompetition() {
        // We start by initializing the two mazes into two similar boards at different addresses
        char[][] Sboard = new char[board.length][board[0].length];
		char[][] Qboard = new char[board.length][board[0].length];
		for (int i=0; i<board.length; i++) {
			for (int j=0; j<board[0].length; j++) {
				Sboard[i][j] = board[i][j];
				Qboard[i][j] = board[i][j];
			}
		}
	
		char[][] Scurrentboard;
		char[][] Qcurrentboard;
		int[] Scurrentlocation; 
		int[] Qcurrentlocation; 
		int Spoints = 0;  // keeps track of the number of points collected throughout the stack-based traversal
		int Qpoints = 0;  // keeps track of the number of points collected throughout the queue-based traversal
		
		// Initialize the Q for the traversal
		QueueL<MazeStatus> Q = new QueueL<MazeStatus>();
		Maze MQ = new Maze(Qboard);
		MazeStatus QMS = new MazeStatus(MQ,0,0);
		Q.enqueue(QMS);
		
		// Initialize the S for the traversal
		StackA<MazeStatus> S = new StackA<MazeStatus>(this.board.length*this.board[0].length);
		Maze MS = new Maze(Sboard);
		MazeStatus SMS = new MazeStatus(MS,0,0);
		S.push(SMS);
		
		while (!Q.isEmpty() && !S.isEmpty()) {
			// We access and remove the maze at the head of our queue
            // ADD CODE HERE
			Node<MazeStatus> Qdata = Q.dequeue();
			MazeStatus temp = Qdata.getData();
			Qcurrentlocation = temp.getLocation();
			Qcurrentboard = this.board;

            // We access and remove the maze at the top of our stack
			// ADD CODE HERE
			MazeStatus Sdata = S.pop();
			Scurrentlocation = Sdata.getLocation();
			Scurrentboard = this.board;
            
			// We check if we are getting any rewards and update the Qpoints
            // ADD CODE HERE
			int Qrow = Qcurrentlocation[0];
			int Qcolumm = Qcurrentlocation[1];
			if(Qcurrentboard[Qrow][Qcolumm]=='X'){
				Qpoints += 0;
			}
			if(Qcurrentboard[Qrow][Qcolumm]=='_'){
				Qpoints += 0;
			}
			if(Qcurrentboard[Qrow][Qcolumm]=='P'){
				Qpoints += 15;
			}
			if(Qcurrentboard[Qrow][Qcolumm]=='p'){
				Qpoints += 10;
			}
			if(Qcurrentboard[Qrow][Qcolumm]=='s'){
				Qpoints += 5;
			}
			if(Qcurrentboard[Qrow][Qcolumm]=='E'){
				Qpoints += 50;
				break;
			}
            
			// We check if we are getting any rewards and update the Spoints
            // ADD CODE HERE
			int Srow = Scurrentlocation[0];
			int Scolumm = Scurrentlocation[1];
			if(Scurrentboard[Srow][Scolumm]=='X'){
				Spoints += 0;
			}
			if(Scurrentboard[Srow][Scolumm]=='_'){
				Spoints += 0;
			}
			if(Scurrentboard[Srow][Scolumm]=='P'){
				Spoints += 15;
			}
			if(Scurrentboard[Srow][Scolumm]=='p'){
				Spoints += 10;
			}
			if(Scurrentboard[Srow][Scolumm]=='s'){
				Spoints += 5;
			}
			if(Scurrentboard[Srow][Scolumm]=='E'){
				Spoints += 50;
				break;
			}
            
            // We update the cell as visited in the Qcurrentboard
			// ADD CODE HERE
            
            // We update the cell as visited in the Scurrentboard
			// ADD CODE HERE
            
            // If one process has reached the end, then we check which one has the most point
            // and we declare the winner and exit
            // ADD CODE HERE

            // If none has reached the exit yet:
            // We identify the next immediate steps in the Qcurrentboard (up / left / down / right?)
            // and enqueue the corresponding maze status in the queue
			// ADD CODE HERE

            // We identify the next immediate steps in the Scurrentboard (up / left / down / right?)
            // and push the corresponding maze status in the stack
			// ADD CODE HERE
 		}	
	}
	
}
