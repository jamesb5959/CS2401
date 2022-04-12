public class Exam {
        public static int[][] question3(int[][] A) {
            int[]	aux;
            for (int i =	0;	i <	A.length - 1;	i++)	{
                if (A[i].length <	A[i+1].length)	{
                    aux =	A[i];
                    A[i]	=	A[i+1];
                    A[i+1]	=	aux;
                }
            }
            return A;
}
    public static void main(String[] args) {
        //int intArray[] = ;
        int[][]	A =	{{},	{1,2,3},	{4,5},	{6}};
        //question3(A);
        System.out.println(question3(A));
    }
}
