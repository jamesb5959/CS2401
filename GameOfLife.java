/* MiniLab 1: starter code
 * Please complete it as instructed below and in the lab description
 */

public class GameOfLife {

	/* Attributes ****************************************************************/
	/* Complete with attributes as described in the lab assignment
	 * Your attributes should be private.
	 */
    int size;
    int[][] board;
    int[][] previous;
	/* Constructors ***************************************************************/
	/* Default constructor: given to you */
	public GameOfLife() {
    }
	
	/* Complete this code:
	 * This constructor takes the size of the board as input
	 * It initializes the size of the game of life to the value of the input.
	 * It creates 2 square boards of this size: board and previous
	 */
	public GameOfLife(int size) {
        // COMPLETE CODE HERE
		board = new int[size][size];
		previous = new int[size][size];
    	}
	
	/* Complete this code:
	 * This constructor takes a board as input
	 * It initializes the size of the game of life to the size of the input board.
	 * It creates 2 square boards of this size: board and previous, both of the same size as the input board B.
	 * It initializes previous to the content of B.
	 */
	public GameOfLife(int[][] B) {
		// COMPLETE CODE HERE
		size = B.length;
		board = new int[B.length][B.length];
        previous = new int[B.length][B.length];
		previous=B;
	}
	
	/* Accessor / Getter *************************************************************/
	/* Complete this code */
	public int[][] getBoard() {
        // COMPLETE CODE HERE
        return board;
	}
	
	/* GIVEN TO YOU: DO NOT MODIFY:
	 * One step of evolution of the whole board:
	 * The method oneStep takes the current board and modifies it so that the new content
	 * reflects the state of the game of life after one step of evolution.
	 */
	public void oneStep() {
		for (int i=0; i<size; i++) {
			for (int j=0; j<size; j++) {
				oneStep(i,j);
			}
		}
		copyToPrevious();
	}
	
	/* Complete this method:
	 * It counts the number of neighbors of a given cell 
	 * (the cell of the board is identified by its index (i,j))
	 */
	public int neighbors(int i, int j) {
		// COMPLETE CODE HERE
		//i=row
		//j=column
		int hasNeighbor=0;
		if(i>0){ //up
			if(previous[i-1][j]==1){
				hasNeighbor++;
			}
		}
		if(j>0){ //left
			if(previous[i][j-1]==1){
				hasNeighbor++;
			}
		}
		if(i<previous.length-1){ //down
			if(previous[i+1][j]==1){
				hasNeighbor++;
			}
		}
		if(j<previous.length-1){ //right
			if(previous[i][j+1]==1){
				hasNeighbor++;
			}
		}
		if(i>0 && j<previous.length-1){ //up right
			if(previous[i-1][j+1]==1){
				hasNeighbor++;
			}
		}
		if(i<previous.length-1 && j<previous.length-1){ //down right
			if(previous[i+1][j+1]==1){
				hasNeighbor++;
			}			
		}
		if(i>0 && j>0){ //up left
			if(previous[i-1][j-1]==1){
				hasNeighbor++;
			}
		}	
		if(i<previous.length-1 && j>0){ //down left
			if(previous[i+1][j-1]==1){
				hasNeighbor++;
			}		
		}
		return hasNeighbor;
	}
	
	/* GIVEN TO YOU: DO NOT MODIFY:
	 * This method implements one step of evolution of a given cell
	 * It figures out and assigns the new value of the board at indices (i,j).
	 */
	public void oneStep(int i, int j) {
		int neighbors = this.neighbors(i,j);

		if (previous[i][j] == 0 && neighbors == 3) board[i][j] = 1;
		else if (previous[i][j] == 1) {
			if (neighbors > 3 || neighbors < 2) board[i][j] = 0;
			else board[i][j] = 1;
		} else board[i][j] = 0;
	}

	/* Complete this method:
	 * This method runs numberOfSteps evolution steps
	 */
	public void evolution(int numberOfSteps) {
		// COMPLETE CODE HERE
		if(numberOfSteps > 0){
			for (int i=0; i<numberOfSteps; i++) {
				this.oneStep();
			}
		}
		else{
			board = previous;
		}
	}

	/************* Misc. Methods **********************************/
	/* GIVEN TO YOU: DO NOT MODIFY:
	 * make a copy of the current board so the current board can be updated
	 */
	public void copyToPrevious() {
		for (int i=0; i<size; i++) {
			for (int j=0; j<size; j++) {
				previous[i][j] = board[i][j];
			}
		}
	}

	/* GIVEN TO YOU: DO NOT MODIFY:
	 * prints the current board
	 */
	public void printBoard() {
		for (int i=0; i<size; i++) {
			for (int j=0; j<size; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}		
	}	
}