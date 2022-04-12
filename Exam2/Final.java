public class Final {
    public static boolean appearsExactly(String str, String sub, int n){
        if ( n == 0 && str.length()<sub.length()) return true;
        if(n != 0 && str.length()<sub.length()) return false;
        if ( str.substring(0, sub.length()).equals(sub) ) {
            return appearsExactly(str.substring(sub.length()), sub, n-1);
        }
        return appearsExactly(str.substring(1), sub, n);
    }

    public static void rotateRows(int[][] A){
        int[] aux=A[0];
        int[] temp;
        int[] last = A[A.length-1];
        for (int i=1; i<A.length; i++) {
            temp=A[i];
            A[i]=aux;
            aux=temp;
        }
        A[0]=last;
    }

    public charLL(String str){
        if(str.length()<0){
            if(next!=null)
            return next.charLL(str);
            char data = str.charAt(0);
            Node newNodeTemp = new Node(data);
            setnext(newNode);
            return next.charLL(str.substring(1));
        }
    }
    public static void main(String[] args) {
        int [][] A = {{1,2,3},
        {4,5,6,7},
        {8,9},
        {10,11,12}};
        rotateRows(A);

        //System.out.println(appearsExactly("catcowcat", "cat", 2));
    }
}
