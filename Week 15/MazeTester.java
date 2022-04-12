import static org.junit.jupiter.api.Assertions.*;
public class MazeTester {
    private char[][] board;

    /*private char[][] testBoard = new char[10][10];
    for (int i=0; i<board.length; i++) {
        for (int j=0; j<board[0].length; j++) {
            testBoard[i][j] = board[i][j];
        }
    }*/

    private char[][] Sboard1 = new char[5][5];
    Maze MS1 = new Maze(Sboard1);
    private char[][] Sboard2 = new char[1][1];
    Maze MS2 = new Maze(Sboard2);
    private char[][] Sboard3 = new char[0][0];
    Maze MS3 = new Maze(Sboard3);

    private char[][] Qboard1 = new char[5][5];
    Maze MQ1 = new Maze(Qboard1);
    private char[][] Qboard2 = new char[1][1];
    Maze MQ2 = new Maze(Qboard2);
    private char[][] Qboard3 = new char[0][0];
    Maze MQ3 = new Maze(Qboard3);

    StackA<MazeStatus> S = new StackA<MazeStatus>(10);
    QueueL<MazeStatus> Q = new QueueL<MazeStatus>();


    //Stack
    @org.junit.jupiter.api.Test 
    void Speek1(){
        MazeStatus test = new MazeStatus(MS1,0,0);
        S.push(test);
        assertEquals(test, S.peek());
    }
    @org.junit.jupiter.api.Test 
    void push(){
        MazeStatus test = new MazeStatus(MS2,0,0);
        assertEquals(S.pop(), S.push(test));
    }
    @org.junit.jupiter.api.Test 
    void pop(){
        MazeStatus test = new MazeStatus(MS2,0,0);
        S.push(test);
        assertEquals(test, S.pop());
    }
    @org.junit.jupiter.api.Test 
    void SisEmpty(){
        assertEquals(true, S.isEmpty());
    }
    @org.junit.jupiter.api.Test 
    void isFull(){
        StackA<MazeStatus> S1 = new StackA<MazeStatus>(1);
        MazeStatus test = new MazeStatus(MS3,0,0);
        S1.push(test);
        assertEquals(true, S1.isFull());
    }

    //Queue
    @org.junit.jupiter.api.Test 
    void Qpeek(){
        assertEquals(null, Q.peek());
    }
    @org.junit.jupiter.api.Test 
    void dequeue(){
        MazeStatus test = new MazeStatus(MQ1,1,2);
        Q.enqueue(test);
        assertEquals(test, Q.dequeue().getData());
    }
    @org.junit.jupiter.api.Test 
    void enqueue(){
        MazeStatus test = new MazeStatus(MQ1,0,0);
        assertEquals(Q.dequeue(), Q.enqueue(test));
    }
    @org.junit.jupiter.api.Test 
    void QisEmpty(){
        assertEquals(true, Q.isEmpty());
    }
}
