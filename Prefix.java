public class Prefix {
    public static Boolean prefix(String str, String[] S) {
        Boolean tureOrFalse = null;
        for (int i = 0; i < S.length; i++) {
            if (S[i].equals(str.substring(0,S[i].length()))) {
                tureOrFalse = true;
                break;
            }
            else{
                tureOrFalse = false;
            }
        }
        return tureOrFalse;
    }
    
    public static void main(String[] args) {
        String[] S = {"a","ab","abc"};
        String str = ("abcde");
        System.out.print(prefix(str, S));
    }
}
