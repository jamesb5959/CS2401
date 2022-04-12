public class Quiz3 {
    public static String repeatEnd(String str, int num){
        String results = "";
        int count = 0;
        String lastChar = str.substring(str.length() - num);
        for(int i=0; i<lastChar.length(); i++){
            results+=str.substring(str.length() - num + count);
            count++;
        }
        return results;

    }

    public static boolean consistent(int[] A, int val){
        int position = 0;
        boolean trueOrFalse = false;
        for(int i=0; i<A.length; i++){
            if(A[position]==val){
                position++;
                trueOrFalse = true;
            }
            else{
                position++;
                trueOrFalse = false;
            }
        }
        return trueOrFalse;
    }
    
    public static void main(String[] args) {
        String str ="Ice Cream";
        int num = 2;
        System.out.println(repeatEnd(str, num));

        int A[] = {0, 1, 2, 1, 0};
        int val = 1;
        System.out.print(consistent(A, val));
    }
}