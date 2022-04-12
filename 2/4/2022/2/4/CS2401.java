public class CS2401 {
    public static void main(String[] args) {
        int[][] A = {{1,2,3},{4,5,6}};
        int[] test = {7,8,9};
        A[1]=test;
        for(int i = 0; i<A.length; i++){
            for(int j = 0; j<A[0].length; j++){
                System.out.println(A[i][j]);
            }
        }
    }
}
